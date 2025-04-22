package br.com.empresa.app.layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

// Baseado em linhas e colunas
public class TesteGridPane extends GridPane {

    public TesteGridPane() {

        Caixa c1 = new Caixa().withText("1");
        Caixa c2 = new Caixa().withText("2");
        Caixa c3 = new Caixa().withText("3");
        Caixa c4 = new Caixa().withText("4");
        Caixa c5 = new Caixa().withText("5");
        Caixa c6 = new Caixa().withText("6");

        // É bom deixar isso ativo para debug
        setGridLinesVisible(true);

        // Sinaliza cinco colunas e cinco linhas. Seria como um getChildren().addAll();
        // E suas regras
        getColumnConstraints().addAll(columnC(), columnC(), fixedColumnC(), columnC(), columnC());
        getRowConstraints().addAll(rowC(), rowC(), rowC(), rowC(), rowC());

        setVgap(10);
        setHgap(10);

        add(c1, 0,0, 2, 2);
        add(c2, 0, 4, 2, 1);
        add(c3, 4, 0);
        add(c4, 3, 2, 2, 3);
        add(c5, 2, 2);
        add(c6, 2, 0, 1, 2);
    }

    // Como ambas irão se comportar
    private ColumnConstraints columnC() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20);
        cc.setFillWidth(true);

        return cc;
    }

    // Um métod0 unico para cada constraint
    private ColumnConstraints fixedColumnC() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setMinWidth(60);
        cc.setMaxWidth(60);
        cc.setFillWidth(true);

        return cc;
    }

    private RowConstraints rowC(){
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20);
        rc.setFillHeight(true);

        return rc;
    }
}
