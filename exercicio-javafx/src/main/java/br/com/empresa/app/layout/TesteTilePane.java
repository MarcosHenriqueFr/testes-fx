package br.com.empresa.app.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TesteTilePane extends TilePane {

    public TesteTilePane(){

        List<Quadrado> quadrados = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            quadrados.add(new Quadrado(i * 10));
        }

        /*
            Todos os Frames são do mesmo tamanho,
            mesmo com os tamanhos de dentro sejam diferentes
         */

        setPadding(new Insets(20, 10, 20, 10));
        setVgap(10);
        setHgap(10);

        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BASELINE_LEFT);
        getChildren().addAll(quadrados);

    }
}
