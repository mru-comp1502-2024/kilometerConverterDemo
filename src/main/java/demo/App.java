package demo;

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


    @Override
    public void start(Stage stage) throws IOException {
        // load the data from the fxml file
        Parent parent = FXMLLoader.load(getClass().getResource("kilometerConverter.fxml"));

        // build the scene
        Scene scene = new Scene(parent);

        // display the window
        stage.setTitle("kilometer converter");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}