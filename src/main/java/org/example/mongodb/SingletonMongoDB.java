package org.example.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;

public class SingletonMongoDB {

    private static MongoClient mongoClient;

    public static synchronized MongoClient connection(ConnectionString connectionString) {
        if (mongoClient == null) mongoClient = MongoDB.connection(connectionString);
        return mongoClient;
    }
}