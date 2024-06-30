package com.mycompany.khata;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainPageController {

    @FXML
    private Label accountIdLabel;

    @FXML
    private Label amountLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Button detailsButton;

    @FXML
    private Button depositButton;

    @FXML
    private Button withdrawButton;

    @FXML
    private Button transferCashButton;

    @FXML
    private Button transactionHistoryButton;

    @FXML
    private Button myInformationButton;

    public void initialize() {
        // Initialize the labels with dummy data
        accountIdLabel.setText("10002");
        amountLabel.setText("$693,423.00");
        typeLabel.setText("Saving Account");

        // Set the images for buttons
        detailsButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/details.png").toExternalForm())));
        depositButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/deposit.png").toExternalForm())));
        withdrawButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/withdraw.png").toExternalForm())));
        transferCashButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/transfer.png").toExternalForm())));
        transactionHistoryButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/history.png").toExternalForm())));
        myInformationButton.setGraphic(new ImageView(new Image(getClass().getResource("/com/mycompany/khata/information.png").toExternalForm())));
    }

    @FXML
    private void handleDetailsButtonAction() {
        // Implement the action for details button
    }

    @FXML
    private void handleDepositButtonAction() {
        // Implement the action for deposit button
    }

    @FXML
    private void handleWithdrawButtonAction() {
        // Implement the action for withdraw button
    }

    @FXML
    private void handleTransferCashButtonAction() {
        // Implement the action for transfer cash button
    }

    @FXML
    private void handleTransactionHistoryButtonAction() {
        // Implement the action for transaction history button
    }

    @FXML
    private void handleMyInformationButtonAction() {
        // Implement the action for my information button
    }
}
