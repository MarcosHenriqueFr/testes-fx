package br.com.empresa.app.layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {

    public TesteAnchorPane() {
        Quadrado q1 = new Quadrado();
        setTopAnchor(q1, 10.);
        setLeftAnchor(q1, 10.);

        // Local do anchor(objeto, padding)
        Quadrado q2 = new Quadrado();
        setTopAnchor(q2, 10.0);
        setRightAnchor(q2, 10.0);

        Quadrado q3 = new Quadrado();
        setBottomAnchor(q3, 10.0);
        setLeftAnchor(q3, 10.0);

        Quadrado q4 = new Quadrado();
        setBottomAnchor(q4, 10.0);
        setRightAnchor(q4, 10.0);

        /*
            Não é uma boa ideia usar um gerenciador de layout de Ancoragem para centralizar
            um objeto, já que ele se baseia nas bordas. Ou seja, não possui referencia central
         */

        // Gambiarra
        // Seleciona a partir de cada quina das outras caixas
        HBox center = new HBox();
        center.setAlignment(Pos.CENTER);
        setTopAnchor(center, 110.);
        setBottomAnchor(center, 110.);
        setRightAnchor(center, 110.);
        setLeftAnchor(center, 110.);

        // Adição do quinto quadrado
        Quadrado q5 = new Quadrado();
        center.getChildren().add(q5);

        getChildren().addAll(q1, q2, q3, q4, center);
    }
}
