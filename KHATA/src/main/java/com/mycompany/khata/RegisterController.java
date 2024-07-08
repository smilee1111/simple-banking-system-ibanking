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
        System.out.println("Register button clicked");
    
        if (usernameField.getText().isBlank() || 
            firstNameField.getText().isBlank() || 
            lastNameField.getText().isBlank() || 
            emailField.getText().isBlank() || 
            passwordField.getText().isBlank() || 
            confirmPasswordField.getText().isBlank()) {
            
            RegisterMessageLabel.setText("Fill all the information");
            return;
        }
        
        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            RegisterMessageLabel.setText("Passwords do not match");
            return;
        }
        
        RegisterMessageLabel.setText("Registration successful");
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