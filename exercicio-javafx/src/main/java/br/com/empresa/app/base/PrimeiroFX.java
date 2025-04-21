package br.com.empresa.app;

// Tudo tem que vir de javaFX
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Esse pacote inteiro funciona com reflections
public class PrimeiroFX extends Application {

    @Override
    public void start(Stage stage){
        // Os botões não fazem nada
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");

        // Assim como na maioria das implementações de botões
        buttonA.setOnAction(event -> System.out.println("Button A pressed"));
        buttonB.setOnAction(event -> System.out.println("Button B pressed"));
        buttonC.setOnAction(event -> System.exit(0));

        VBox box = new VBox(); // VerticalBox -> Alinha verticalmente

        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(buttonA, buttonB, buttonC);

        Scene mainScene = new Scene(box, 400, 400, Color.WHITE);

        stage.setScene(mainScene);
        stage.show();
    }

    public static void main(String... args){
        launch(args);
    }
}
