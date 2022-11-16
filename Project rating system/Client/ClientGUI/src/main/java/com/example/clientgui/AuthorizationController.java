package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthorizationController {

    @FXML
    private TextField lognInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    void onEnter(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.typesView, Client.changingWindowUtility.typesW, Client.changingWindowUtility.typesH, "Типы проектов");
    }

    @FXML
    void onRegistration(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.registrationView, Client.changingWindowUtility.registrationW, Client.changingWindowUtility.registrationH, "Регистрация");
    }

}
