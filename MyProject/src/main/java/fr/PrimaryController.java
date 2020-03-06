package fr;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button buttonseConnecter1;

    @FXML
    private TextField Textfeild1;

    @FXML
    private PasswordField passWordl1;

    @FXML
    private Label Label1;

    @FXML
    void handleButton(ActionEvent event) throws Exception {
        App.setRoot("Etat_De_Frais_Engages");
    }

}
