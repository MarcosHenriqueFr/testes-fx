package br.com.empresa.app.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import br.com.empresa.app.layout.Quadrado;

public class AppLayout extends Application {

    public void start(Stage stage){
        Scene main = new Scene(new TesteAnchorPane(), 800, 600);

        stage.setScene(main);
        stage.setTitle("Gerenciadores de Layout");
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
