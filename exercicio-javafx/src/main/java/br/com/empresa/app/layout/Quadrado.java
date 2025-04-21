package br.com.empresa.app.layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {
    private static int i = 0;
    private String[] cores = {"#c33c5e", "#39aac6", "#28d79a",
            "#fb750e", "#6657a8", "#f9060e"
    };

    // Mais Simples
    public Quadrado(){
        // Altura padrão
        this(100, 100);
    }

    public Quadrado(int width, int height){
        setWidth(width);
        setHeight(height);

        setFill(Color.web(cores[i]));

        i++;
        if(i == 6) i = 0;
    }
}
