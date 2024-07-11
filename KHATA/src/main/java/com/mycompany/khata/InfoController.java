package com.mycompany.khata;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
public class InfoController {
    
    @FXML
    private TextField usernameField;

    @FXML
    private TextField firstnameField;

    @FXML
    private TextField lastnameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private DatePicker dateField;

    @FXML
    private Label infomessagelabel;

    @FXML
    private Button confirmbutton;

    
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
    private void handleconfirmInfo(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Update Confirm");
        alert.setHeaderText("Are you sure? do you want to Update??");

          if (alert.showAndWait().get() == ButtonType.OK) {
            infomessagelabel.setText("Update Successful");
                    
                    // Clear the message after 2 seconds
                    Timeline timeline = new Timeline(new KeyFrame(
                        Duration.millis(3000),
                        ae -> infomessagelabel.setText("")
                    ));
                    timeline.play();
                };
       
        }
    

    @FXML
    void handleexit(ActionEvent event) {
        try{
            App.setRoot("mainpage");
        }catch (IOException e){
            e.printStackTrace();

        }
       
    }
}
