package fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PrepareStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;

public class Connexion {
    private String login;
    private String nom;
    private String mdp;

    public static String[] tableauString() {
        String[] res = new String[3];
        res[0] = "jdbc:mysql://localhost:3308/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        res[1] = "root";
        res[2] = "";
        return res;
    }

    public void connexion(String[] res) {

        try {
            Connection conn = DriverManager.getConnection(res[0], res[1], res[2]);

            PreparedStatement statement = conn
                    .prepareStatement("SELECT mdp FROM visiteurs WHERE login ='" + login + "'");

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