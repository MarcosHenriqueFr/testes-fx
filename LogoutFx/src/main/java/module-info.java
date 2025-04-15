module com.empresa.logoutfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.empresa.logoutfx to javafx.fxml;
    exports com.empresa.logoutfx;
}