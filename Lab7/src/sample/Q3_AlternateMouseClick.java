package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q3_AlternateMouseClick extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sample");
/*
        VBox root = new VBox();

        Text text1 = new Text("Java is fun!");
        Button btn = new Button("change text");

        ClickCount clickCount = new ClickCount();

        // lambda function cannot change value of an int
        // it can only change the value of a class' attribute
        // therefore we have to create a class ClickCount
        // to change the value of count every time the button is clicked
        btn.setOnAction(actionEvent -> {
            if(clickCount.count % 2 == 0) {
                text1.setText("Java is fun!");
            }
            else {
                text1.setText("What text!");
            }
            clickCount.count += 1;
        });

        root.getChildren().addAll(text1, btn);
 */

        VBox root = new VBox();
        Text text = new Text("Java is fun!");

        ClickCount clickCount = new ClickCount();

        root.setOnMouseClicked(mouseEvent -> {
            if(clickCount.count % 2 == 0) {
                text.setText("Java is fun!");
            }
            else {
                text.setText("What text!");
            }
            clickCount.count += 1;
        });

        root.getChildren().addAll(text);
        stage.setScene(new Scene(root, 400, 400));
        stage.show();
    }

    class ClickCount {
        int count = 0;
    }
}
