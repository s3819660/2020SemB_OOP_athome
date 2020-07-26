package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.Random;

public class Q6_TwoCirclesOneLine {
    public String title = "TwoCirclesOneLine";

    public Pane mainScene(int screenX, int screenY) {
        // build 2 random circles
        Random rd = new Random();

        // regular random method
//        int centerX1 = rd.nextInt(400 - 15) + 15; // circle is displayed fully
//        int centerY1 = rd.nextInt(400 - 15) + 15; // scene bound = 400
//        int centerX2 = rd.nextInt(400 - 15) + 15; // bound(from 15 to 385)
//        int centerY2 = rd.nextInt(400 - 15) + 15;

        // use another random method
        int centerX1 = (int) ((Math.random() * ((screenX - 15) - 15)) + 15);
        int centerY1 = (int) ((Math.random() * ((screenY - 15) - 15)) + 15);
        int centerX2 = (int) ((Math.random() * ((screenX - 15) - 15)) + 15);
        int centerY2 = (int) ((Math.random() * ((screenY - 15) - 15)) + 15);


        Pane pane = new Pane();
        Circle c1 = new Circle(centerX1, centerY1, 15.0f);
        Circle c2 = new Circle(centerX2, centerY2, 15.0f, Paint.valueOf("#ff0000"));

        // draw a connecting line
        Line line = new Line(centerX1 + 15, centerY1 - 15, centerX2 + 15, centerY2 - 15);

        pane.getChildren().addAll(c1, c2, line);

        return pane;
    }
}
