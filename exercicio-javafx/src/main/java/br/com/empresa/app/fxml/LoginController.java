package br.com.empresa.app.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    // Faz uma mapeação direta ao controlador, a partir do FXML
    // Os nomes tem que ser os mesmos do FXML, pois o Controller não consegue identificar

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField pwField;

    public void entrar(){
        System.out.println(emailField.getText());
        System.out.println(pwField.getText());
    }
}
