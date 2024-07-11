package com.mycompany.khata;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginConfirmationPopupController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private Stage stage;
    private InfoController infoController;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setInfoController(InfoController infoController) {
        this.infoController = infoController;
    }

    @FXML
    private void handleconfirm() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("john".equals(username) && "123".equals(password)) {
            infoController.updateSuccessful();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Credentials");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password.");
            alert.showAndWait();
        }
    }
}
