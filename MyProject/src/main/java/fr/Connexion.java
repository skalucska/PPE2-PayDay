package fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PrepareStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

public class Connexion {
    private String login;
    private String nom;
    private String mdp;

    public void connexion() {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String login = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(dbURL, login, password)) {
            statement = conn.prepareStatement("SELECT mdp FROM visiteurs WHERE login ='" + login + "'");

            resultat = statement.executeQuery();

            if (resultat.next()) {
                String motDePasse = resultat.getString(1);
                if (motDePasse.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Connexion réussie ! ", "Success", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Mot de passe incorrect ! ", "Error", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login incorrect ! ", "Error", 1);
            }

            // Récupération de la requête dans une variable
            resultat = statement.executeQuery();

            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}