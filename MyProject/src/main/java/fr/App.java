package fr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("sample"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String Etat_De_Frais_Engages) throws IOException {
        scene.setRoot(loadFXML(Etat_De_Frais_Engages));
    }

    private static Parent loadFXML(String sample) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(sample + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}