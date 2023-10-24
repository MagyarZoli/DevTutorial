package org.example.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;


public class MongoDB {

//    //old version
//    public static MongoClient connection(ConnectionString connectionString) {
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .serverApi(ServerApi.builder()
//                        .version(ServerApiVersion.V1)
//                        .build())
//                .build();
//        return tryCreate(settings);
//    }

    public static MongoClient connection(ConnectionString connectionString) {
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder()
                        .automatic(true)
                        .build()));
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
        return tryCreate(settings);
    }

    private static MongoClient tryCreate(MongoClientSettings settings) {
        MongoClient mongoClient = null;
        try {
            mongoClient = MongoClients.create(settings);
        } catch (MongoException me) {
            System.err.println("Unable to connect to the MongoDB instance due to an error: " + me);
        }
        return mongoClient;
    }
}