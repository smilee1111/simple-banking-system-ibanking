package com.mycompany.khata;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class InformationController {

    @FXML
    void handlemMainPage(ActionEvent event) {

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
