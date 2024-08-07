package com.mycompany.khata;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DetailController {

       @FXML
    private TextField accountcodeField;

    @FXML
    private TextField accounttypeField;

    @FXML
    private TextField balanceField;

    @FXML
    private TextField usernameField;
    
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
    private void handleexit(ActionEvent event) {
        try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
