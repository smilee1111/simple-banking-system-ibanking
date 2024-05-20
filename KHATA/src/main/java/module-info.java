module com.mycompany.khata {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.khata to javafx.fxml;
    exports com.mycompany.khata;
}
