package sample.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Sample {
    public static void main(String[] args) {
        Button btn = new Button("abc");

        btn.setOnAction(Sample::handle); // high-order function
    }

    public static void handle(ActionEvent actionEvent) {

    }
}
