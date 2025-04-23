package br.com.empresa.app.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.net.URL;

// O load fica mais demorado
public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Os processos são semelhantes, e ambos, CSS e FXML tem que ser carregados no meu start
        String fileCSS = getClass().getResource("/br/com/empresa/app/fxml/LoginStyle.css").toExternalForm();
        URL fileFXML = getClass().getResource("/br/com/empresa/app/fxml/Login.fxml");

        GridPane root = FXMLLoader.load(fileFXML);
        Scene scene = new Scene(root, 350, 350);
        scene.getStylesheets().add(fileCSS);

        stage.setResizable(false); // Não permite a alteração do tamanho
        stage.setTitle("Tela de Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
