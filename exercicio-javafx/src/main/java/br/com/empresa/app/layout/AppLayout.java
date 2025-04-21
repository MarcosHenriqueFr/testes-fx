package br.com.empresa.app.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

    public void start(Stage stage){

        VBox temp = new VBox();
        temp.getChildren().add(new Caixa().withText("1"));
        temp.getChildren().add(new Caixa().withText("2"));
        temp.getChildren().add(new Caixa().withText("3"));
        temp.getChildren().add(new Caixa().withText("4"));

        Scene main = new Scene(temp, 800, 800);

        stage.setTitle("Gerenciadores de Layout");
        stage.setScene(main);
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
