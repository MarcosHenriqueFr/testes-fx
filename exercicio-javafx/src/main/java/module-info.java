module exerciciofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.empresa.app to javafx.fxml;
    exports br.com.empresa.app;
}