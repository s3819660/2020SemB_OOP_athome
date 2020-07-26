package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static int numberofWord = 10; // default number of flashcards

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        FlashCardGUI flashCardGUI = new FlashCardGUI();
        primaryStage.setTitle(flashCardGUI.TITLE);
        Parent root = flashCardGUI.mainScene();

        // event-driven


        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
