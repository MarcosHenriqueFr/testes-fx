package br.com.empresa.app.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

    public TesteFlowPane(){

        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();
        Quadrado q4 = new Quadrado();
        Quadrado q5 = new Quadrado();

        setHgap(10);
        setVgap(10);
        // O mesmo padding para todos os lados
        setPadding(new Insets(10));

        // Por padrão é horizontal
        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER);

        // Fica por padrão um do lado do outro, responsivo
        getChildren().addAll(q1, q2, q3, q4, q5);
    }
}
