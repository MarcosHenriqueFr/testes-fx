package br.com.empresa.app;

import javafx.application.Application;
import javafx.stage.Stage;

//Sem o uso de FXML
public class Wizard extends Application {

    @Override
    public void start(Stage stage){

        stage.setTitle("Wizard");
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
