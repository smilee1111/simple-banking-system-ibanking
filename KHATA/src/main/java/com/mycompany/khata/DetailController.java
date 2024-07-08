package com.mycompany.khata;
import javafx.fxml.FXML;

import java.io.IOException;

import javafx.event.ActionEvent;

public class DetailController {

    @FXML
    void handleexit(ActionEvent event) {
         try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
