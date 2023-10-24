package org.example.mongodb;

import com.mongodb.client.*;
import com.mongodb.client.model.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertManyResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.BsonValue;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    private static final String CONNECTION = "mongodb+srv://<user>:<password>@<cluster>.gd7v733.mongodb.net/?retryWrites=true&w=majority";

    private static final String connectionString = System.getProperty("mongodb.uri");

    private static final Document doc1 = new Document()
            .append("account_holder", "john doe")
            .append("accoutn_id", "MDB791015881")
            .append("balance", 1785)
            .append("account_type", "checking");

    private static final Document doc2 = new Document()
            .append("account_holder", "john doe")
            .append("accoutn_id", "MDB791115843")
            .append("balance", 1468)
            .append("account_type", "checking");

    public static void main(String[] args) {

    }

    public static void insert() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            MongoDatabase database = mongoClient.getDatabase("bank");
            MongoCollection<Document> collection = database.getCollection("accounts");

            InsertOneResult insertOneResult = collection.insertOne(doc1);
            BsonValue id = insertOneResult.getInsertedId();
            System.out.println(id);

            List<Document> docList = Arrays.asList(doc1, doc2);
            InsertManyResult insertManyResult = collection.insertMany(docList);
            Map<Integer, BsonValue> ids = insertManyResult.getInsertedIds();
            ids.forEach((k, v) -> System.out.println(v.asObjectId()));
        }
    }

    public static void find() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            MongoDatabase database = mongoClient.getDatabase("bank");
            MongoCollection<Document> collection = database.getCollection("accounts");

            collection.find(
                    Filters.and(
                            Filters.gte("balance", 1000),
                            Filters.eq("account_type", "checking")))
                    .forEach(doc -> System.out.println(doc.toJson()));

            try (MongoCursor<Document> cursor = collection.find(
                    Filters.and(
                            Filters.gte("balance", 1000),
                            Filters.eq("account_type", "checking")))
                    .iterator()) {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            }

            Document doc = collection.find(
                    Filters.and(
                            Filters.gte("balance", 1000),
                            Filters.eq("account_type", "checking")))
                    .first();
            assert doc != null;
            System.out.println(doc.toJson());
        }
    }

    public static void update() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            MongoDatabase database = mongoClient.getDatabase("bank");
            MongoCollection<Document> collection = database.getCollection("accounts");

            Bson query = Filters.eq("account_id", "MDB791115843");
            Bson update = Updates.combine(
                    Updates.set("account_status", "active"),
                    Updates.inc("balance", 100));
            UpdateResult updateOneResult = collection.updateOne(query, update);

            Bson query2 = Filters.eq("account_id", "MDB791115843");
            Bson update2 = Updates.combine(
                    Updates.set("account_status", "active"),
                    Updates.inc("minimum_balance", 100));
            UpdateResult updateManyResult = collection.updateMany(query2, update2);
        }
    }

    public static void delete() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            MongoDatabase database = mongoClient.getDatabase("bank");
            MongoCollection<Document> collection = database.getCollection("accounts");

            Bson query3 = Filters.eq("account_holder", "john doe");
            DeleteResult deleteOneResult = collection.deleteOne(query3);
            System.out.println(deleteOneResult.getDeletedCount());

            Bson query4 = Filters.eq("account_status", "dormant");
            DeleteResult deleteManyResult = collection.deleteMany(query3);
            System.out.println(deleteManyResult.getDeletedCount());
        }
    }

    public static void transactions() {
        final MongoClient mongoClient = MongoClients.create(connectionString);
        final ClientSession clientSession = mongoClient.startSession();

        TransactionBody<String> txnBody = () -> {
            MongoCollection<Document> collection = mongoClient.getDatabase("bank")
                    .getCollection("accounts");

            Bson from = Filters.eq("account_id", "MDB791115843");
            Bson with = Updates.inc("balance", -200);

            Bson to = Filters.eq("account_id", "MDB791015881");
            Bson deposit = Updates.inc("balance", 200);

            collection.updateOne(clientSession, from, with);
            collection.updateOne(clientSession, to, deposit);
            return "Transferred funds";
        };

        try {
            clientSession.withTransaction(txnBody);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            clientSession.close();
        }
    }

    public static void aggregation() {
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("bank");
            MongoCollection<Document> collection = database.getCollection("accounts");
            matchStage(collection);
            matchAndGroupStages(collection);
            matchSortAndProjectStages(collection);
        }
    }

    private static void matchStage(MongoCollection<Document> collection) {
        Bson matchStage = Aggregates.match(
                Filters.eq("account_id", "MDB791115843"));

        collection.aggregate(Arrays.asList(matchStage))
                .forEach(doc -> System.out.println(doc.toJson()));
    }

    private static void matchAndGroupStages(MongoCollection<Document> collection) {
        Bson matchStage = Aggregates.match(
                Filters.eq("account_id", "MDB791115843"));
        Bson groupStage = Aggregates.group(
                "$account_type",
                Accumulators.sum("total_balance", "$balance"),
                Accumulators.avg("average_balance", "$balance"));

        collection.aggregate(Arrays.asList(matchStage, groupStage))
                .forEach(doc -> System.out.println(doc.toJson()));
    }

    private static void matchSortAndProjectStages(MongoCollection<Document> collection) {
        Bson matchStage = Aggregates.match(
                Filters.and(
                        Filters.gt("balance", 1500),
                        Filters.eq("account_type", "checking")));
        Bson sortStage = Aggregates.sort(
                Sorts.orderBy(
                        Sorts.descending("balance")));
        Bson projectStage = Aggregates.project(
                Projections.fields(
                        Projections.include("account_id", "account_type", "balance"),
                        Projections.computed("euro_balance", new Document(
                                "$divide",
                                Arrays.asList("$balance", 1.20F))),
                        Projections.excludeId()));

        collection.aggregate(Arrays.asList(matchStage, sortStage, projectStage))
                .forEach(doc -> System.out.println(doc.toJson()));
    }
}