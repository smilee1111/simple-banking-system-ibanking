
package com.mycompany.khata;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class MainPageController{


    @FXML
    private Label mainpagemessagelabel;

    @FXML
    private void initialize() { mainpagemessagelabel.setText("  Account Selected");
        mainpagemessagelabel.setTextFill(Color.BLACK);
        mainpagemessagelabel.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));

       
        Timeline timeline = new Timeline(
            new KeyFrame(
                Duration.millis(3000),
                ae -> {
                    mainpagemessagelabel.setText("");
                    mainpagemessagelabel.setTextFill(Color.TRANSPARENT);
                    mainpagemessagelabel.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
                }
            )
        );
        timeline.play();
    }


    @FXML
    private ImageView bankLogo;

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
    private void handleinfo(ActionEvent event) {
        try {
            App.setRoot("info");
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

