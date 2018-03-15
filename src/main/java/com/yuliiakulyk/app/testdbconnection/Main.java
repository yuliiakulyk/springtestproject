package com.yuliiakulyk.app.testdbconnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Yuliia Kulyk on 15.03.2018.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/menagerie";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args) {
        Connection connection;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Connection is established");
            }



            connection.close();
            if (connection.isClosed()) {
                System.out.println("Connection is closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
