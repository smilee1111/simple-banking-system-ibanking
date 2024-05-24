package com.mycompany.khata;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {
        // Handle login logic here
    }

    @FXML
    private void handleReset() {
        usernameField.clear();
        passwordField.clear();
    }

    @FXML
    private void handleRegister() {
        try {
            App.setRoot("register");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Failed to load register page.");
        }
    }
}
