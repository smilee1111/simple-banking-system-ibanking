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
           // Handle registration logic here
        if(usernameField.getText().isBlank()==true && firstNameField.getText().isBlank()==true && lastNameField.getText().isBlank()==true && emailField.getText().isBlank()==true && passwordField.getText().isBlank()==true && confirmPasswordField.getText().isBlank()==true) {
            RegisterMessageLabel.setText("Fill all the information");
        }
        // Handle registration logic here
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