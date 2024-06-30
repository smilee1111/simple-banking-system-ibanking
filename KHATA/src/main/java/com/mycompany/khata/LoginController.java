package com.mycompany.khata;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField accountNoField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField passwordFieldVisible;

    @FXML
    private CheckBox showPasswordCheckbox;

    @FXML
    private Label messageLabel;

    @FXML
    private void initialize() {
        passwordFieldVisible.managedProperty().bind(showPasswordCheckbox.selectedProperty());
        passwordFieldVisible.visibleProperty().bind(showPasswordCheckbox.selectedProperty());
        passwordFieldVisible.textProperty().bindBidirectional(passwordField.textProperty());

        passwordField.managedProperty().bind(showPasswordCheckbox.selectedProperty().not());
        passwordField.visibleProperty().bind(showPasswordCheckbox.selectedProperty().not());
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        String accountNo = accountNoField.getText();
        String password = passwordField.getText();

        if (isValidLogin(accountNo, password)) {
            try {
                App.setRoot("mainpage");
            } catch (IOException e) {
                e.printStackTrace();
                messageLabel.setText("Failed to load main page.");
            }
        } else {
            messageLabel.setText("Invalid account number or password.");
        }
    }

    private boolean isValidLogin(String accountNo, String password) {
        return accountNo.equals("john") && password.equals("123");
    }

    @FXML
    private void handleReset() {
        accountNoField.clear();
        passwordField.clear();
        passwordFieldVisible.clear();
    }

    @FXML
    private void handleRegister(ActionEvent event) {
        try {
            App.setRoot("register");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Error loading register page");
        }
    }
}
