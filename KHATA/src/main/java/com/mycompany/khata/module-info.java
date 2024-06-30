module com.mycompany.khata {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.mycompany.khata to javafx.fxml;
    exports com.mycompany.khata;
}
