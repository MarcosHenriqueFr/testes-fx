package br.com.empresa.app.layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

// Coloca os elementos como uma pilha
public class TesteStackPane extends StackPane {

    public TesteStackPane(){

        Caixa c1 = new Caixa().withText("1");
        Caixa c2 = new Caixa().withText("2");
        Caixa c3 = new Caixa().withText("3");
        Caixa c4 = new Caixa().withText("4");
        Caixa c5 = new Caixa().withText("5");
        Caixa c6 = new Caixa().withText("6");

        getChildren().addAll(c1, c2, c3, c4, c5, c6);

        // Evento direto no StackPane
        setOnMouseClicked(e -> {
            // Saber o lado a partir do evento
            if(e.getSceneX() > getScene().getWidth()/2){
                // Sempre envia para o front
                getChildren().getFirst().toFront();
            } else {
                getChildren().getLast().toBack();
            }
        });


        // Uso de threads no javaFX
        // Não reseta o tempo
        Thread t = new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(3000);

                    Platform.runLater(() -> {
                        getChildren().getFirst().toFront();
                    });

                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        t.setDaemon(true); // Morre com a principal
        t.start();
    }
}
