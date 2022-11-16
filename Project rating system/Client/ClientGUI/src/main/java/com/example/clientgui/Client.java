package com.example.clientgui;

import connectionModule.ConnectionModule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {

    public static ChangingWindowUtility changingWindowUtility;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setResizable(false);
        changingWindowUtility = new ChangingWindowUtility(stage);
        changingWindowUtility.showWindow(changingWindowUtility.authorizationView, changingWindowUtility.authorizationW, changingWindowUtility.authorizationH, "Авторизация");

        try {

            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            ConnectionModule.connectToServer();
            var userType = ConnectionModule.singUp("admin", "admin");
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // В контексте авторизации доступны singUp, Register, checkIfLoginExist после этого все кроме них


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}