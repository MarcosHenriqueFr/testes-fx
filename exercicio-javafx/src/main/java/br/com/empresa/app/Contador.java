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

    // Coloque as variáveis ou elemento que serão usados dentro da classe principal
    private Button buttonIncrease;
    private Button buttonDecrease;
    private Label titleLabel;
    private Label numberLabel;

    // Essa informação ficaria dentro do meu model
    private int counter = 0;

    // Separo no start as funções do stage e das scenes
    @Override
    public void start(Stage stage){
        String cssPATH = getClass()
                        .getResource("/br/com/empresa/app/ContadorStyle.css")
                        .toExternalForm();

        Scene mainScene = new Scene(createMainBox(), 400, 400);
        mainScene.getStylesheets().add(cssPATH);
        mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald"); // Import

        stage.setScene(mainScene);
        stage.show();
    }

    private VBox createMainBox() {
        // Poderia criar direto, porém é necessário seguir uma ordem de execução
        createLabels();
        HBox buttonBox = createButtonBox();
        VBox mainBox = new VBox();

        // Configs do mainBox
        mainBox.getStyleClass().add("content"); // Adição de uma classe diretamente no meu java
        mainBox.setSpacing(10);
        mainBox.setAlignment(Pos.CENTER);
        mainBox.getChildren().addAll(titleLabel, numberLabel, buttonBox);

        return mainBox;
    }

    private void createLabels() {
        this.titleLabel = new Label("Contador");
        this.numberLabel= new Label("0");

        titleLabel.getStyleClass().add("title");
        numberLabel.getStyleClass().add("number");
    }

    /*
        Cria uma HBox a partir dos botões criados e retornados em uma array
        Qualquer configuração específica deve ser feita dentro dos métodos  específicos
        Todos os métodos possuem poucas funções
     */
    private HBox createButtonBox() {
        createButtons();
        HBox buttonsBox = new HBox(buttonIncrease, buttonDecrease);
        buttonsBox.setSpacing(10);
        buttonsBox.setAlignment(Pos.CENTER);

        return buttonsBox;
    }

    // Cria os dois botões e retorna uma array
    private void createButtons() {
        this.buttonDecrease = new Button("-");
        this.buttonIncrease = new Button("+");
        setActionsButtons();
    }

    private void setActionsButtons() {
        // Agora que são variáveis de classe, é possível modificar com facilidade
        buttonIncrease.setOnAction(event ->
                numberLabel.setText(Integer.toString(++counter)));

        buttonDecrease.setOnAction(event ->
                numberLabel.setText(Integer.toString(--counter)));
    }

    public static void main(String... args){
        launch(args);
    }
}
