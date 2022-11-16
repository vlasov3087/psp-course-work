package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ProfileController {

    @FXML
    private TextField fullnameInput;

    @FXML
    private TextField organizationInput;

    @FXML
    void onCancel(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.userView, Client.changingWindowUtility.userW, Client.changingWindowUtility.userH, "Управление пользователями");
    }

    @FXML
    void onOK(ActionEvent event) {

    }

}
