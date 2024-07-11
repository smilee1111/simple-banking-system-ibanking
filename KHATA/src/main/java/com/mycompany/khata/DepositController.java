package com.mycompany.khata;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.util.Duration;

public class DepositController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField depositField; 

    @FXML
    private PasswordField passwordField;

    @FXML
    private DatePicker dateField;

    @FXML
    private Label depositmessagelabel;

    @FXML
    private Button confirmbuttons;

    @FXML
    private AnchorPane scenepane;

    @FXML
    private void handledetail(ActionEvent event) {
        try {
            App.setRoot("detail");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handledeposit(ActionEvent event) {
        try {
            App.setRoot("deposit");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlewithdraw(ActionEvent event) {
        try {
            App.setRoot("withdraw");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handletransferfunds(ActionEvent event) {
        try {
            App.setRoot("transfer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlehistory(ActionEvent event) {
        try {
            App.setRoot("history");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleconfirmDeposit(ActionEvent event) {
        if (usernameField.getText().isBlank() || 
            passwordField.getText().isBlank() || 
            depositField.getText().isBlank() ||
            dateField.getValue()==null ) {
            depositmessagelabel.setText("Fill all the information");
            Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(2000), 
            ae -> depositmessagelabel.setText("")));
            atimeline.play();
            return; 
        }
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Deposit Confirm");
        alert.setHeaderText("Are you sure? do you want to deposit??");
  
        if (alert.showAndWait().get() == ButtonType.OK) {
                    depositmessagelabel.setText("Deposit Successful");
                    depositField.clear();
                    usernameField.clear();
                    passwordField.clear();
                    
                    
                  
                    Timeline timeline = new Timeline(new KeyFrame(
                        Duration.millis(2000), 
                        ae -> depositmessagelabel.setText("")
                        
                    ));
                    timeline.play();
                };
        }
   
    @FXML
    private void handleexit(ActionEvent event) {
        try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
