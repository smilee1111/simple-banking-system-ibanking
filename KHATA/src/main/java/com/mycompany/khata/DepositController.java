package com.mycompany.khata;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DepositController {

    @FXML
    private Button confirmbutton;

    @FXML
    private AnchorPane scenepane;

    private Stage stage;

    @FXML
    private void handleconfirm(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirm");
        alert.setHeaderText("Are you sure?");
        alert.setContentText("Do you want to deposit?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            Platform.runLater(() -> {
                stage = (Stage) scenepane.getScene().getWindow();
                System.out.println("You deposited");
                stage.close();
            });
        }
    }

    @FXML
    private void handleexit() {
        try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
