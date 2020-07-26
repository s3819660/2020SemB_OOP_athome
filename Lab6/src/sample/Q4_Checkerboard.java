package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Q4_Checkerboard {
    public String title = "Checkerboard";

    public GridPane mainScene() {
        GridPane checkerboardPane = new GridPane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    Rectangle rectangle = new Rectangle(50, 50, Color.WHITE);
                    checkerboardPane.add(rectangle, i, j);
                }
                else {
                    Rectangle rectangle = new Rectangle(50, 50, Color.BLACK);
                    checkerboardPane.add(rectangle, i, j);
                }
            }
        }

        return checkerboardPane;
    }
}
