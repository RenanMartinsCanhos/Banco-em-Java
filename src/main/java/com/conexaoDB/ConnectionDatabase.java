package com.example.java.conexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

    private static final String url = "jdbc:mysql://localhost:3306/BancoPoo";
    private static final String user = "root";
    private static final String password = "root";
    private static Connection conn;

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados" + e.getMessage());
        }
        return null;
    }
}
