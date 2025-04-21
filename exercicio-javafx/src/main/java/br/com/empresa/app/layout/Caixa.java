package br.com.empresa.app.layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {

    private static int i = 0;
    private String[] cores = {"#c33c5e", "#39aac6", "#28d79a",
                              "#fb750e", "#6657a8", "#f9060e"
    };

    public Caixa(){
        // Altura padrão
        this(100, 100);
    }

    public Caixa(int width, int height){
        setAlignment(Pos.CENTER);
        setMinWidth(width);
        setMinHeight(height);

        // Paint, Borda, Inset
        BackgroundFill fill = new BackgroundFill(Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));

        // Sempre que eu criar uma nova caixa ele adiciona
        // E seleciona a cor de background de acordo com a ordem
        i++;
        if(i == 6) i = 0;
    }

    // Fluent Programming
    public Caixa withText(String text){
        Label label = new Label(text);
        label.setFont(new Font(24));
        getChildren().add(label);
        return this;
    }
}
