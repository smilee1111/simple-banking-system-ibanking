package com.mycompany.khata;

import java.io.IOException;

import javafx.fxml.FXML;

public class WithdrawController {
    @FXML
    private void handleexit() {
        try {
            App.setRoot("mainpage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
