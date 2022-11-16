package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RequestManagementController {

    @FXML
    private Button applyButton;

    @FXML
    private TextField costFromInput;

    @FXML
    private TextField costToInput;

    @FXML
    private Button discardButton;

    @FXML
    private TableView<?> requestTable;

    @FXML
    private TextField riskFromInput;

    @FXML
    private TextField riskToInput;

    @FXML
    void onApply(ActionEvent event) {

    }

    @FXML
    void onApplyFilter(ActionEvent event) {

    }

    @FXML
    void onDiscard(ActionEvent event) {

    }

    @FXML
    void onGoBack(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.typesView, Client.changingWindowUtility.typesW, Client.changingWindowUtility.typesH, "Типы проектов");
    }

}
