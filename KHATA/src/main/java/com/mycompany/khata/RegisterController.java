package com.mycompany.khata;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
        System.out.println("Register button clicked");
    
        if (usernameField.getText().isBlank() || 
            firstNameField.getText().isBlank() || 
            lastNameField.getText().isBlank() || 
            emailField.getText().isBlank() || 
            passwordField.getText().isBlank() || 
           dobField.getValue() == null ||
            confirmPasswordField.getText().isBlank()) {
            
            RegisterMessageLabel.setText("Fill all the information");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
            return;
        }
        

        if (dobField.getValue() == null || dobField.getValue().isAfter(LocalDate.now())) {
            RegisterMessageLabel.setText("Invalid date of birth");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
           
            return;
        }

        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            RegisterMessageLabel.setText("Passwords do not match");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
           
            return;
        }

        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            RegisterMessageLabel.setText("Passwords do not match");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
           
            return;
        }
        if (!isPasswordStrong(passwordField.getText())) {
            RegisterMessageLabel.setText("Password must be at least 8 characters long");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
        
            return;
        }
             Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Account Type");
        alert.setHeaderText("Select Account Type");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Saving Account", "Current Account", "Fixed Account");

        VBox vbox = new VBox();
        vbox.getChildren().add(choiceBox);
        alert.getDialogPane().setContent(vbox);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            String selectedAccountType = choiceBox.getValue();
            if (selectedAccountType == null) {
                RegisterMessageLabel.setText("Please select an account type");
                return;
            }

            // Handle account type selection logic here
            System.out.println("Selected account type: " + selectedAccountType);
            RegisterMessageLabel.setText("Registration successful");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
            
        } else {
            RegisterMessageLabel.setText("Registration cancelled");
              Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(3000), 
            ae -> RegisterMessageLabel.setText("")));
            atimeline.play();
        }
    }  
    
    private boolean isPasswordStrong(String password) {
        return password.length() >= 2;
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
