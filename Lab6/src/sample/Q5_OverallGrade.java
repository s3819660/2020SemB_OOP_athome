package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class Q5_OverallGrade {
    public String title = "Bar Chart";

    public GridPane mainScene() {
        GridPane overallGradePane = new GridPane();

        // build rectangles
        Rectangle projectRect = new Rectangle(80, 40, Color.RED);
        Rectangle quizRect = new Rectangle(80, 20, Color.BLUE);
        Rectangle midtermRect = new Rectangle(80, 60, Color.GREEN);
        Rectangle finalRect = new Rectangle(80, 80, Color.YELLOW);

        // ArrayList of rectangles
        ArrayList<Rectangle> rects = new ArrayList<>(List.of(projectRect, quizRect, midtermRect, finalRect));

        // gaps and padding
        overallGradePane.setHgap(10);
        overallGradePane.setPadding(new Insets(10, 10, 10, 10));

        // add rectangles to panes
        overallGradePane.add(quizRect, 1, 0);
        overallGradePane.add(midtermRect, 2, 0);
        overallGradePane.add(finalRect, 3, 0);

        // legends
        Text projectTxt = new Text("Project -- 20%");
        Text quizTxt = new Text("Quiz -- 10%");
        Text midtermTxt = new Text("Midterm -- 30%");
        Text finalTxt = new Text("Final -- 40%");

        // ArrayList of legends
        ArrayList<Text> texts = new ArrayList<Text>(List.of(projectTxt, quizTxt, midtermTxt, finalTxt));

//         regular Text and Rectangle's position adjusting
        VBox projectBox = new VBox();
//        projectBox.setAlignment(Pos.BOTTOM_CENTER);
//        projectBox.getChildren().addAll(projectTxt, projectRect);
//        overallGradePane.add(projectBox, 0, 0);

//        VBox projectBox = new VBox();
        VBox quizBox = new VBox();
//        quizBox.setAlignment(Pos.BOTTOM_CENTER);
//        quizBox.getChildren().addAll(quizTxt, quizRect);
//        overallGradePane.add(projectBox, 0, 0);

        VBox midtermBox = new VBox();
//        midtermBox.setAlignment(Pos.BOTTOM_CENTER);
//        midtermBox.getChildren().addAll(midtermTxt, midtermRect);
//        overallGradePane.add(projectBox, 0, 0);

        VBox finalBox = new VBox();
//        projectBox.setAlignment(Pos.BOTTOM_CENTER);
//        projectBox.getChildren().addAll(projectTxt, projectRect);
//        overallGradePane.add(projectBox, 0, 0);

        ArrayList<VBox> vBoxes = new ArrayList<VBox>(List.of(projectBox, quizBox, midtermBox, finalBox));

        // using loop to adjust Text and Rectangle's position
        for(int i = 0; i < 4; i++) {
            vBoxes.get(i).setAlignment(Pos.BOTTOM_CENTER);
            vBoxes.get(i).getChildren().addAll(texts.get(i), rects.get(i));
            overallGradePane.add(vBoxes.get(i), i, 0);
        }

        // set position on pane
        RowConstraints x = new RowConstraints();
        x.setValignment(VPos.BOTTOM);
        for(int i = 0; i < 4; i++) {
            overallGradePane.getRowConstraints().add(x);
        }

        return overallGradePane;
    }
}
