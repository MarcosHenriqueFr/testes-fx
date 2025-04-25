package br.com.empresa.app.group;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class AppTest extends Application {

    List<HBox> boxes = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {

        updateBoxes();
        VBox root = new VBox();

        AnchorPane anchorPane = new AnchorPane();
        GridPane gridPane = new GridPane();

        gridPane.setGridLinesVisible(true);
        gridPane.getColumnConstraints().addAll(colC(), colC(), colC());
        gridPane.add(boxes.getFirst(), 0, 0);
        gridPane.add(boxes.get(1), 1, 0);
        gridPane.add(boxes.get(2), 2, 0);
        gridPane.setStyle(" -fx-background-color: blue; ");

        anchorPane.getChildren().addAll(boxes.get(3), boxes.get(4));
        AnchorPane.setLeftAnchor(boxes.get(3), 0.);
        AnchorPane.setRightAnchor(boxes.get(4), 0.);
        anchorPane.setStyle(" -fx-background-color: red; ");

        root.getChildren().addAll(anchorPane, gridPane);
        root.setSpacing(20);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.setAlignment(Pos.CENTER);
        root.setStyle(" -fx-background-color: gray; ");

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ColumnConstraints colC(){
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(100);
        cc.setFillWidth(true);

        return cc;
    }

    private void updateBoxes(){
        boxes.add(new HBox());
        boxes.add(new HBox());
        boxes.add(new HBox());
        boxes.add(new HBox());
        boxes.add(new HBox());

        BackgroundFill backgroundFill = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        Border defBorder =
                new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        for(HBox box: boxes){
            box.setBackground(background);
            box.setBorder(defBorder);
            box.setMinWidth(100);
            box.setMinHeight(100);
            box.setAlignment(Pos.CENTER);
        }
    }

    public static void main(String... args) {
        launch(args);
    }
}
