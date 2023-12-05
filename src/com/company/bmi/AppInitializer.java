package com.company.bmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("view/bmiCalculator.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        primaryStage.setTitle("BMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {launch(args);
    }





}
