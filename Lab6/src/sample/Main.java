package sample;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // exercise 2, using fxml method
//        Parent root = FXMLLoader.load(getClass().getResource("fourflags.fxml"));
//        primaryStage.setTitle("Ex 1");

//        // exercise 2, using code generated pane
//        Q2_fourflags fourflags = new Q2_fourflags();
//        Parent root = fourflags.mainScene();
//        primaryStage.setTitle(fourflags.title);

        // excercise 3
        Q3_3RandoCards randomCards = new Q3_3RandoCards();
        Parent root = randomCards.mainScene();
        primaryStage.setTitle("Card Game");

        // excercise 4
//        Q4_Checkerboard checkerboard = new Q4_Checkerboard();
//        Parent root = checkerboard.mainScene();
//        primaryStage.setTitle(checkerboard.title);

        // exercise 5
//        Q5_OverallGrade overallGrade = new Q5_OverallGrade();
//        Parent root = overallGrade.mainScene();
//        primaryStage.setTitle("Overall Grade");

        // exercise 5 if writing BarChart
//        BarChart root = new BarChart(3);
//
//        ArrayList<Color> colors = new ArrayList<>();
//        ArrayList<Integer> series = new ArrayList<>();
//        ArrayList<String> legends = new ArrayList<>();
//
//        root.setColors(colors);
//        root.setSeries(series);
//        root.setLegends(legends);

//        // main exercise 5
//        primaryStage.setScene(new Scene(root));
//        primaryStage.setMinHeight(300);
//        primaryStage.show();

        // exercise 6
//        Q6_TwoCirclesOneLine twoCirclesOneLine = new Q6_TwoCirclesOneLine();
//        Parent root = twoCirclesOneLine.mainScene(500, 500);

        // excercise 8
//        Q8_TrafficLight trafficLight = new Q8_TrafficLight();
//        Parent root = trafficLight.mainScene();

        // excercise 8: Factory Pattern
//        Q8_TrafficLightFactoryPattern trafficLightFactoryPattern = new Q8_TrafficLightFactoryPattern();
//        Parent root = trafficLightFactoryPattern.mainScene();

        // common parts
//        primaryStage.setScene(new Scene(root, 500, 500)); // excercise 6
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
