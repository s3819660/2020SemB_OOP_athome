package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

// This method uses a design pattern called Factory Pattern

class TrafficLightFactoryPattern extends Circle {
    Paint paintOn;
    Paint paintOff = Paint.valueOf("#808080");

    public TrafficLightFactoryPattern(String color) {
        setRadius(50);
        paintOn = Paint.valueOf(color);
        turnOff();
    }

    public TrafficLightFactoryPattern turnOn() {
        setFill(paintOn);
        return this;
    }

    public TrafficLightFactoryPattern turnOff() {
        setFill(paintOff);
        return this;
    }

    // Factory functions
    public static TrafficLightFactoryPattern turnRedOn() {
        return new TrafficLightFactoryPattern("#ff0000");
    }

    public static TrafficLightFactoryPattern turnGreenOn() {
        return new TrafficLightFactoryPattern("#009933");
    }

    public static TrafficLightFactoryPattern turnYellowOn() {
        return new TrafficLightFactoryPattern("#FFCF3E");
    }
}

class TrafficLightHandlerFactoryPattern implements EventHandler<ActionEvent> {
    private int clickNumber; // the number of clicks determines the light that is being turned on
    TrafficLightFactoryPattern[] trafficLights = new TrafficLightFactoryPattern[3];

    public TrafficLightHandlerFactoryPattern(TrafficLightFactoryPattern red, TrafficLightFactoryPattern green,
                                             TrafficLightFactoryPattern yellow) {
        trafficLights[0] = red;
        trafficLights[1] = green;
        trafficLights[2] = yellow;

        clickNumber = 0;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        // lightOn = 0 => red, lightOn = 1 => green, lightOn = 2 => yellow
        clickNumber += 1;
        int lightOn = clickNumber % 3;

        for(int i = 0; i < 3; i++) {
            if(i == lightOn) {
                trafficLights[i].turnOn();
            }
            else {
                trafficLights[i].turnOff();
            }
        }
    }
}

public class Q8_TrafficLightFactoryPattern {
    public VBox mainScene() {
        VBox vBox = new VBox();

        HBox commandsBox = new HBox();
        Button nextBtn = new Button("Next");
        Button exitBtn = new Button("Exit");
        commandsBox.getChildren().addAll(nextBtn, exitBtn);
        commandsBox.setAlignment(Pos.CENTER);

        TrafficLightFactoryPattern redTrafficlight = TrafficLightFactoryPattern.turnRedOn();
        TrafficLightFactoryPattern greenTrafficlight = TrafficLightFactoryPattern.turnGreenOn();
        TrafficLightFactoryPattern yellowTrafficlight = TrafficLightFactoryPattern.turnYellowOn();

        // initially turn red light on
        redTrafficlight.turnOn();

        // Event-Driven
        TrafficLightHandlerFactoryPattern handler = new TrafficLightHandlerFactoryPattern(redTrafficlight,
                                                    greenTrafficlight, yellowTrafficlight);

        nextBtn.setOnAction(handler);

        // add to VBox
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(redTrafficlight, greenTrafficlight, yellowTrafficlight, commandsBox);

        return vBox;
    }
}
