package br.com.empresa.app.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        //Coloco o resultado do FXML loader direto no root
        URL fileFXML = getClass().getResource("/br/com/empresa/app/fxml/Login.fxml");
        GridPane root = FXMLLoader.load(fileFXML);

        Scene scene = new Scene(root, 350, 400);
        stage.setResizable(false); // Não permite a alteração do tamanho
        stage.setTitle("Tela de Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
