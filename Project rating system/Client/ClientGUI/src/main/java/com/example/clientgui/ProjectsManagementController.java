package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProjectsManagementController {

    @FXML
    private TextField costFromInput;

    @FXML
    private TextField costToInput;

    @FXML
    private TextField creatorSearchInput;

    @FXML
    private TableView<?> projectsTable;

    @FXML
    private TextField riskFromInput;

    @FXML
    private TextField riskToInput;

    @FXML
    private ComboBox<?> typeCombo;

    @FXML
    void onApply(ActionEvent event) {

    }

    @FXML
    void onGoBack(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.typesView, Client.changingWindowUtility.typesW, Client.changingWindowUtility.typesH, "Типы проектов");
    }

    @FXML
    void onReport(ActionEvent event) {

    }

    @FXML
    void onSendEmail(ActionEvent event) {

    }

    @FXML
    void onTop(ActionEvent event) {

    }

}
