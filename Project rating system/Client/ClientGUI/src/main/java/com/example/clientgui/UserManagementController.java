package com.example.clientgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class UserManagementController {

    @FXML
    private TableView<?> usersTable;

    @FXML
    void onBan(ActionEvent event) {

    }

    @FXML
    void onEdit(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.profileView, Client.changingWindowUtility.profileW, Client.changingWindowUtility.profileH, "Редактирование профиля");
    }

    @FXML
    void onGoBack(ActionEvent event) {
        Client.changingWindowUtility.showWindow(Client.changingWindowUtility.typesView, Client.changingWindowUtility.typesW, Client.changingWindowUtility.typesH, "Типы проектов");
    }

    @FXML
    void onUnban(ActionEvent event) {

    }

}
