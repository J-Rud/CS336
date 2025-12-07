package com.example;
import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/deliverable2";
        String user = "root";
        String pass = "Cs336@garcia";
        return DriverManager.getConnection(url, user, pass);
    }
}