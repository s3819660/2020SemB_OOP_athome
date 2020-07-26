package sample.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Line_demo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    StackPane buildLine() {
        StackPane root = new StackPane();

        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(0.0f);
        line.setEndX(100.0f);
        line.setEndY(100.0f);

        root.getChildren().add(line);

        return root;
    }

    @Override
    public void start(Stage primarystage) throws Exception {
        StackPane root = buildLine();
        Scene scene = new Scene(root);
        primarystage.setScene(scene);
        primarystage.show();
    }
}
