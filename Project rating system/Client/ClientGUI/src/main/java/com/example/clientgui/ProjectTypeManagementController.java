package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ProjectTypeManagementController {

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private Button requestsButton;

    @FXML
    private TextField searchTypeInput;

    @FXML
    private TextField typeInput;

    @FXML
    private TableView<?> typesTable;

    @FXML
    private Button usersButton;

    @FXML
    void onAbout(ActionEvent event) {

    }

    @FXML
    void onAdd(ActionEvent event) {

    }

    @FXML
    void onDelete(ActionEvent event) {

    }

    @FXML
    void onEdit(ActionEvent event) {

    }

    @FXML
    void onExit(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.authorizationView, Client.changingWindowUtility.authorizationW, Client.changingWindowUtility.authorizationH, "Авторизация");
    }

    @FXML
    void onHistory(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.projectsView, Client.changingWindowUtility.projectsW, Client.changingWindowUtility.projectsH, "История проектов");
    }

    @FXML
    void onKeyTypedSearch(KeyEvent event) {

    }

    @FXML
    void onRequestsButton(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.requestView, Client.changingWindowUtility.requestW, Client.changingWindowUtility.requestH, "Заявки");
    }

    @FXML
    void onUsersManagement(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.userView, Client.changingWindowUtility.userW, Client.changingWindowUtility.userW, "Управление пользователями");
    }

}
