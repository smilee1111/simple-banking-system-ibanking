package com.mycompany.khata;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        // Check if any field is blank and set the appropriate message
        if (usernameField.getText().isBlank() || 
            firstNameField.getText().isBlank() || 
            lastNameField.getText().isBlank() || 
            emailField.getText().isBlank() || 
            passwordField.getText().isBlank() || 
            confirmPasswordField.getText().isBlank()) {
            
            RegisterMessageLabel.setText("Fill all the information");
            return;
        }
    
        // Handle registration logic here
        // For example, you can check if the passwords match
        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            RegisterMessageLabel.setText("Passwords do not match");
            return;
        }
    
        // If all fields are filled and passwords match, proceed with registration
        RegisterMessageLabel.setText("Registration successful");
        // Add your registration logic here
    }
    
    @FXML
    private void handleBackToLogin() {
        try {
            App.setRoot("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}