package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CalculateRiscController {

    @FXML
    private TextField costInput;

    @FXML
    private TextField incomeInput;

    @FXML
    private TextField nameInput;

    @FXML
    private TextField timeInput;

    @FXML
    private ComboBox<?> typeCombo;

    @FXML
    void onCancel(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.projectsView, Client.changingWindowUtility.projectsW, Client.changingWindowUtility.projectsH, "Заявки");
    }

    @FXML
    void onSave(ActionEvent event) {

    }

}
