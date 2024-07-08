module bettermentfix {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens bettermentfix to javafx.fxml;
    exports bettermentfix;
}
