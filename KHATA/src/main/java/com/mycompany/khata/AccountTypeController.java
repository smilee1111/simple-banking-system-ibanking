package com.mycompany.khata;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class AccountTypeController {

    @FXML
    private ChoiceBox<String> accountTypeChoiceBox;

    private Stage stage;
    private RegisterController registerController;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }

    @FXML
    private void initialize() {
        accountTypeChoiceBox.getItems().addAll("Saving Account", "Current Account", "Fixed Account");
    }

    @FXML
    private void handleConfirm() {
        String selectedAccountType = accountTypeChoiceBox.getValue();
        if (selectedAccountType == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select an account type.");
            alert.showAndWait();
        } else {
            System.out.println("Selected account type: " + selectedAccountType);
            registerController.registerSuccessful();
            stage.close();
        }
    }
}
