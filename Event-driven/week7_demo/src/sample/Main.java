package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class MyEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Click");
    }
}

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button button = new Button("Click me!");
        Button button1 = new Button("Button1");
        TextField textField = new TextField();

        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("enter pressed");
            }
        });

        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("key typed");
            }
        });

        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("key pressed");
            }
        });

        // force the field to be numeric only
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        GridPane pane = new GridPane();
        pane.add(button, 0, 0);
        pane.add(button1, 0, 1);
        pane.add(textField, 0, 2);

        /**
             * anonymous class, use this when implement ONE TIME
         */
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Click");
//            }
//        });

        /**
         * using a normal class, use many times
         */
        button.setOnAction(new MyEventHandler());
        button1.setOnAction(new MyEventHandler());

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getButton() == MouseButton.PRIMARY) {
                    System.out.println("left click");
                }
                if(mouseEvent.getButton() == MouseButton.SECONDARY) {
                    System.out.println("right clicks");
                }
            }
        });

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
