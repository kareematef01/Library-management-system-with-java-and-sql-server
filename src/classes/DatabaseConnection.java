/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Kimo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;encrypt=false;trustServerCertificate=true;databaseName=librarydb;"+ "user=sa;password=5555;";
    

    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(URL);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

      public Connection getConnection() {
        try {
                       if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL);
                System.out.println("Reconnected to the database.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to reconnect: " + e.getMessage());
        }
        return connection;
    }
    
}

