package com.example.teacher_panel_application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPanel extends Application {
    private FXMLLoader fxmlLoader;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login_fragment.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        //stage.getIcons().add(new Image("/assets/pngegg.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}