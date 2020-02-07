package fr;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public final class Sql {
    public static void main(String[] args) {
        connexion();
    }

    public static void connexion() {
        String dbURL = "jdbc:mysql://localhost:3306/GSB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            String sql = "SELECT * FROM visiteurs";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while (result.next()) {
                String nom = result.getString(2);
                String mois = result.getString(3);
                String matricule = result.getString(1);
                int matricule1 = Integer.parseInt(matricule);

                String output = "User #%d: %s - %s";
                System.out.println(String.format(output, matricule1, nom, mois));
            }

            if (conn != null) {
                // System.out.println("Connected");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}