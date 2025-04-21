package br.com.empresa.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//Sem o uso de FXML
public class Wizard extends Application {

    // É relativamente mais fácil fazer sem FXML
    private Stage window;
    private Scene step1;
    private Scene step2;
    private Scene step3;

    @Override
    public void start(Stage stage){
        window = stage;

        // Definição das Cenas
        createFirstStep();
        createSecondStep();
        createThirdStep();

        window.setScene(step1);
        window.setTitle("Wizard");
        window.show();
    }

    private void createFirstStep(){
        // Configs do Botão
        Button buttonToNextStep = new Button("Ir para o passo 2 >>");
        buttonToNextStep.setOnAction(event -> window.setScene(step2));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(buttonToNextStep);

        step1 = new Scene(box, 400, 400);
    }

    private void createSecondStep(){
        // Configs dos Botões
        Button buttonToPreviousStep = new Button("<< Voltar para o passo 1");
        buttonToPreviousStep.setOnAction(event -> window.setScene(step1));

        Button buttonToNextStep = new Button("Ir para o passo 3 >>");
        buttonToNextStep.setOnAction(event -> window.setScene(step3));


        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(buttonToPreviousStep, buttonToNextStep);

        step2 = new Scene(box, 400, 400);
    }

    private void createThirdStep(){
        // Configs dos Botões
        Button buttonToPreviousStep = new Button("<< Voltar para o passo 2");
        buttonToPreviousStep.setOnAction(event -> window.setScene(step2));

        Button buttonEndApplication = new Button("Finalizar!");
        buttonEndApplication.setOnAction(event -> System.exit(0));

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(buttonToPreviousStep, buttonEndApplication);

        step3 = new Scene(box, 400, 400);
    }

    public static void main(String... args){
        launch(args);
    }
}
