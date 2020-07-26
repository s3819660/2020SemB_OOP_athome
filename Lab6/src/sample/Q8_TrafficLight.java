package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

class TrafficLightHandler implements EventHandler<ActionEvent> {
    private int clickNumber;
    TrafficLight[] trafficLights = new TrafficLight[3];

    public TrafficLightHandler(TrafficLight red, TrafficLight green, TrafficLight yellow) {
        trafficLights[0] = red;
        trafficLights[1] = green;
        trafficLights[2] = yellow;

        clickNumber = 0; // initially clickNumber = 0
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        // 0 = red, 1 = green, 2 = yellow
        clickNumber += 1;
        int turnedOn = clickNumber % 3;

        for(int i = 0; i < 3; i++) {
            if(i == turnedOn) {
                trafficLights[i].turnOn();
            }
            else {
                trafficLights[i].turnOff();
            }
        }
    }
}

class TrafficLight extends Circle {
    Paint paintOn;
    Paint paintOff = Paint.valueOf("#808080");

    public TrafficLight(String color) {
        setRadius(50);
        paintOn = Paint.valueOf(color);
        turnOff();
    }

    public void turnOn() {
        setFill(paintOn);
    }

    public void turnOff() {
        setFill(paintOff);
    }
}

public class Q8_TrafficLight {

    public VBox mainScene() {
        VBox vBox = new VBox();

        HBox commandsBox = new HBox();
        Button nextBtn = new Button("Next");
        Button exitBtn = new Button("Exit");
        commandsBox.getChildren().addAll(nextBtn, exitBtn);
        commandsBox.setAlignment(Pos.CENTER);
/*
        Circle c1 = new Circle(50, Paint.valueOf("#ff0000"));
        Circle c2 = new Circle(50, Paint.valueOf("#808080"));
        Circle c3 = new Circle(50, Paint.valueOf("#808080"));
*/
        TrafficLight redTrafficLight = new TrafficLight("#ff0000");
        TrafficLight greenTrafficLight = new TrafficLight("#009933");
        TrafficLight yellowTrafficLight = new TrafficLight("#FFCF3E");

        // initial color
        redTrafficLight.turnOn();

        // Event-Driven
        TrafficLightHandler handler = new TrafficLightHandler(redTrafficLight, greenTrafficLight, yellowTrafficLight);
        nextBtn.setOnAction(handler);

        // add to VBox
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(redTrafficLight, greenTrafficLight, yellowTrafficLight, commandsBox);


        return vBox;
    }
}
