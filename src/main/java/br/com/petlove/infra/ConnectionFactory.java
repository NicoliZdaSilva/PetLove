package br.com.petlove.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory() {}

    public static Connection getConnection() {
        try {
            // URL corrigida com o formato correto para o driver JDBC
            String url = "jdbc:postgresql://localhost:5432/PetShop";
            String user = "postgres";
            String password = "9973155";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
