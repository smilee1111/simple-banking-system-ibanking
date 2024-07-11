package com.mycompany.khata;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import javafx.scene.control.Button;


public class WithdrawController {

    @FXML
    private Button confirmbutton;

    @FXML
    private AnchorPane scenepane;

    @FXML
    private Label withdrawmessagelabel;

    @FXML
    private TextField usernameField;

     @FXML
    private TextField withdrawField; 

    @FXML
    private PasswordField passwordField;

    @FXML
    private DatePicker dateField;



    @FXML
    private void initialize() {
       
    }

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
    private void handleconfirmWithdraw(ActionEvent event) {
        if (usernameField.getText().isBlank() || 
        passwordField.getText().isBlank() || 
        withdrawField.getText().isBlank()||
        dateField.getValue()==null  ) {
            withdrawmessagelabel.setText("Fill all the information");
        Timeline atimeline=new Timeline(new KeyFrame(Duration.millis(2000),
         ae -> withdrawmessagelabel.setText("")));
         atimeline.play();
        return; 
    }
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Withdraw Confirm");
        alert.setHeaderText("Are you sure? do you want to withdraw??");
        
        if (alert.showAndWait().get() == ButtonType.OK) {
                    withdrawmessagelabel.setText("Withdraw Successful");
                    Timeline timeline = new Timeline(new KeyFrame(
                        Duration.millis(2000), 
                        ae -> withdrawmessagelabel.setText("")
                    ));
                    timeline.play();
                    withdrawField.clear();
                    usernameField.clear();
                    passwordField.clear();
                    dateField.setValue(null);
                };
        }

    @FXML
    private void handleexit() {
        try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
