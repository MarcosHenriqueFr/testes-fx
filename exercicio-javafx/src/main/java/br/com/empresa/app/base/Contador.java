package br.com.empresa.app.base;

import javafx.application.Application;
import javafx.css.PseudoClass;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private Button buttonIncrease;
    private Button buttonDecrease;
    private Label titleLabel;
    private Label numberLabel;

    // Uso de pseudo classes para mudanças de status
    private final PseudoClass positivePseudoClass = PseudoClass.getPseudoClass("positive");
    private final PseudoClass negativePseudoClass = PseudoClass.getPseudoClass("negative");

    private int counter = 0;

    @Override
    public void start(Stage stage){
        String cssPATH = getClass()
                        .getResource("/br/com/empresa/app/base/ContadorStyle.css")
                        .toExternalForm();

        Scene mainScene = new Scene(createMainBox(), 400, 400);
        updateLabelColor();
        mainScene.getStylesheets().add(cssPATH);
        mainScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald"); // Import

        stage.setScene(mainScene);
        stage.show();
    }

    private VBox createMainBox() {
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

    private void createButtons() {
        this.buttonDecrease = new Button("-");
        this.buttonIncrease = new Button("+");
        buttonDecrease.getStyleClass().add("buttons");
        buttonIncrease.getStyleClass().add("buttons");

        setActionsButtons();
    }

    private void updateLabelColor(){
        // Instancia e depois usa diretamente no código
        numberLabel.pseudoClassStateChanged(positivePseudoClass, counter > 0);
        numberLabel.pseudoClassStateChanged(negativePseudoClass, counter < 0);
    }

    private void setActionsButtons() {
        // Dá um update cada vez que é clicado
        buttonIncrease.setOnAction(event -> {
            numberLabel.setText(Integer.toString(++counter));
            updateLabelColor();
        });

        buttonDecrease.setOnAction(event -> {
            numberLabel.setText(Integer.toString(--counter));
            updateLabelColor();
        });
    }

    public static void main(String... args){
        launch(args);
    }
}
