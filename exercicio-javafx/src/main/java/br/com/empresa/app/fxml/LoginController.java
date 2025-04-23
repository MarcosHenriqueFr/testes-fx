package br.com.empresa.app.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {

    // Faz uma mapeação direta ao controlador, a partir do FXML
    // Os nomes tem que ser os mesmos do FXML, pois o Controller não consegue identificar

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField pwField;

    public void entrar(){
        boolean emailValid = emailField.getText().equals("teste@email.com");
        boolean pwValid = pwField.getText().equals("12345");

        if(emailValid && pwValid) {
            Notifications.create()
                    .position(Pos.TOP_CENTER)
                    .title("Login FXML")
                    .text("Entrou com sucesso!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_CENTER)
                    .title("Login FXML")
                    .text("Falha ao entrar!")
                    .showError();
        }
    }
}
