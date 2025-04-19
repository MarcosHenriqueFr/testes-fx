package br.com.empresa.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Sem o uso de fxml, feito diretamento no código
public class Contador extends Application {

    // Separo no start as funções do stage e das scenes
    @Override
    public void start(Stage stage){
        // Quando criar os métodos, usar uma construção inversa

        Scene mainScene = new Scene(createMainBox(), 400, 400);
        stage.setScene(mainScene);
        stage.show();
    }

    private VBox createMainBox() {
        // Poderia criar direto, porém é necessário seguir uma ordem de execução
        HBox buttonBox = createButtonBox();
        VBox mainBox = new VBox();

        // Configs do mainBox
        mainBox.setSpacing(10);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.getChildren().addAll(createLabels());
        mainBox.getChildren().add(buttonBox);

        return mainBox;
    }

    private Label[] createLabels() {
        Label titleLabel = new Label("Contador");
        Label numberLabel= new Label("0");

        return new Label[]{titleLabel, numberLabel};
    }

    /*
        Cria uma HBox a partir dos botões criados e retornados em uma array
        Qualquer configuração específica deve ser feita dentro dos métodos  específicos
        Todos os métodos possuem poucas funções
     */
    private HBox createButtonBox() {
        HBox buttonsBox = new HBox(createButtons());
        buttonsBox.setSpacing(10);
        buttonsBox.setAlignment(Pos.CENTER);

        return buttonsBox;
    }

    // Cria os dois botões e retorna uma array
    private Button[] createButtons() {
        Button buttonDecrease = new Button("-");
        Button buttonIncrease = new Button("+");

        return new Button[]{buttonIncrease, buttonDecrease};
    }

    public static void main(String... args){
        launch(args);
    }
}
