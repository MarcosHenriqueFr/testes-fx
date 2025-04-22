module exerciciofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    // Poderia ser um opens para qualquer um, porém fica mais encapsulado
    exports br.com.empresa.app.base;
    opens br.com.empresa.app.base to javafx.fxml;

    exports br.com.empresa.app.layout;
    opens br.com.empresa.app.layout to javafx.fxml;

    exports br.com.empresa.app.fxml;
    opens br.com.empresa.app.fxml to javafx.fxml;
}