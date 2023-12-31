package org.example.jdbc.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {

    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(
            String host, String databaseName,
            String username, String password) {
        url = "jdbc:postgres://" + host + "/" + databaseName;
        properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
    }

    public Connection getConnection()
            throws SQLException {
        return DriverManager.getConnection(url, properties);
    }
}