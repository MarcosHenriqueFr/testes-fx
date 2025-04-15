module com.empresa.commcontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.commcontroller to javafx.fxml;
    exports com.empresa.commcontroller;
}