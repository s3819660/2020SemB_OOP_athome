package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main1 extends Application {
    public Main1() {
        System.out.println("Test constructor is invoked");
    }
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        System.out.println("start method is invoked");
    }
    public static void main(String[] args) {
        System.out.println("launch application");
        Application.launch(args);
    }
}
