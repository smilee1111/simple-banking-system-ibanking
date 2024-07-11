package com.mycompany.khata;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label LoginMessageLabel;

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
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if(usernameField.getText().isBlank()==true || passwordField.getText().isBlank()==true){
            LoginMessageLabel.setText("Enter Username or Password");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(2000), 
            ae -> LoginMessageLabel.setText("")));
            atimeline.play();
            return;
        }else if (isValidLogin(username, password)) {
            try {
                App.setRoot("mainpage");
            } catch (IOException e) {
                e.printStackTrace();
                messageLabel.setText("Failed to load main page.");
            }
        } else {
            LoginMessageLabel.setText("Invalid Username or Password.");
             Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(2000), 
            ae -> LoginMessageLabel.setText("")));
            atimeline.play();
        }
    }

    private boolean isValidLogin(String username, String password) {
        return username.equals("john") && password.equals("123");
    }

    @FXML
    private void handleReset() {
        usernameField.clear();
        passwordField.clear();
        passwordFieldVisible.clear();
        LoginMessageLabel.setText("");  
    }

    @FXML
    private void handleRegister(ActionEvent event) {
        try {
            App.setRoot("register");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
