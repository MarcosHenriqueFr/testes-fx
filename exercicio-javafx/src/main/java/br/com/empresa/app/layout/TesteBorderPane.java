package br.com.empresa.app.layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

    public TesteBorderPane(){

        // Aqui o getChildren já é automatico, pq é mais simples
        // As caixas se adaptam ao tamanho da tela
        // É mais facil de setar, porém a delimitação fica dentro do stage
        Caixa c1 = new Caixa().withText("Topo");
        setTop(c1);

        Caixa c2 = new Caixa().withText("Esquerda");
        setLeft(c2);

        Caixa c3 = new Caixa().withText("Direita");
        setRight(c3);

        Caixa c4 = new Caixa().withText("Baixo");
        setBottom(c4);

        Caixa c5 = new Caixa().withText("Centro");
        setCenter(c5);
    }
}
