module exerciciofx {
    requires javafx.controls;
    requires javafx.fxml;

    exports br.com.empresa.app.base;
    opens br.com.empresa.app.base to javafx.fxml;

    exports br.com.empresa.app.layout;
    opens br.com.empresa.app.layout to javafx.fxml;
}