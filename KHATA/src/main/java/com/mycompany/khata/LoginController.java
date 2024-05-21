package com.mycompany.khata;

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
        String username = usernameField.getText();
        String password = passwordField.getText();
        if ("admin".equals(username) && "password".equals(password)) {
            messageLabel.setText("Login successful!");
            // Proceed to the next scene
        } else {
            messageLabel.setText("Invalid username or password");
        }
    }

    @FXML
    private void handleReset() {
        usernameField.setText("");
        passwordField.setText("");
        messageLabel.setText("");
    }
}
