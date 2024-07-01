
package com.mycompany.khata;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainPageController{

    @FXML
    private ImageView bankLogo;

    @FXML
    private void handledetails(ActionEvent event) {
        try {
            App.setRoot("details");
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
    private void handleinformation(ActionEvent event) {
        try {
            App.setRoot("information");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handlelogout() {
        try {
            App.setRoot("login");
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
   
        
    }

