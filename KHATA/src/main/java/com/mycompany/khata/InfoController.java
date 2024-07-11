package com.mycompany.khata;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
public class InfoController {
    
    
    @FXML
    private Button confirmbutton;

    @FXML
    private DatePicker dateofbirthField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField firstNameField;

    @FXML
    private Label infomessagelabel;

    @FXML
    private TextField lastNameField;

    @FXML
    private PasswordField passwordField;

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
    private void handleconfirmInfo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpopup.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Confirm Update");

            LoginConfirmationPopupController controller = loader.getController();
            controller.setStage(stage);
            controller.setInfoController(this);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateSuccessful() {
        infomessagelabel.setText("Update Successful");

        Timeline timeline = new Timeline(new KeyFrame(
            Duration.millis(2000),
            ae -> infomessagelabel.setText("")
        ));
        timeline.play();
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
