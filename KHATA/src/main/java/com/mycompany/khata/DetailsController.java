package com.mycompany.khata;

import java.io.IOException;

import javafx.fxml.FXML;

public class DetailsController {
    
    @FXML
    private void handleexit() {
        try {
            App.setRoot("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
