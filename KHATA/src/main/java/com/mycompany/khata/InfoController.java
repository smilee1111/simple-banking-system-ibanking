package com.mycompany.khata;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class InfoController {

    @FXML
    void handleexit(ActionEvent event) {
        try{
            App.setRoot("mainpage");
        }catch (IOException e){
            e.printStackTrace();

        }
       
    }
}
