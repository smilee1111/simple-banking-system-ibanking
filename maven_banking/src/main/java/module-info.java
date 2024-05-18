module banking.maven {
    requires javafx.controls;
    requires javafx.fxml;

    opens banking.maven to javafx.fxml;
    exports banking.maven;
}
