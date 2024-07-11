package com.mycompany.khata;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private DatePicker dobField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Label RegisterMessageLabel;

    @FXML
    private void handleRegister() {

        if (usernameField.getText().isBlank() || 
            firstNameField.getText().isBlank() || 
            lastNameField.getText().isBlank() || 
            emailField.getText().isBlank() || 
            passwordField.getText().isBlank() || 
            dobField.getValue() == null || 
            confirmPasswordField.getText().isBlank()) {

            showErrorMessage("Fill all the information");
            return;
        }

        if (dobField.getValue() == null || dobField.getValue().isAfter(LocalDate.now())) {
            showErrorMessage("Invalid date of birth");
            return;
        }

        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            showErrorMessage("Passwords do not match");
            return;
        }

        if (!isPasswordStrong(passwordField.getText())) {
            showErrorMessage("Password must be at least 8 characters long");
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/khata/accounttype.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Account Type");

            AccountTypeController controller = loader.getController();
            controller.setStage(stage);
            controller.setRegisterController(this);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showErrorMessage(String message) {
        RegisterMessageLabel.setText(message);
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(2000), ae -> RegisterMessageLabel.setText("")));
        timeline.play();
    }

    public void registerSuccessful() {
        RegisterMessageLabel.setText("Registration successful");
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(3000), ae -> RegisterMessageLabel.setText("")));
        timeline.play();
        usernameField.clear();
        firstNameField.clear();
        lastNameField .clear();
        emailField.clear();        
        passwordField.clear();
        dobField.setValue(null);
        confirmPasswordField.clear();
    }

    @FXML
    private void handleBackToLogin() {
        try {
            App.setRoot("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isPasswordStrong(String password) {
        return password.length() >= 2;
    }
}
