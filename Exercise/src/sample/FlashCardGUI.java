package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class FlashCardGUI {
    public final String TITLE = "Flashcards";

    public VBox mainScene() {
        VBox flashcardGUI = new VBox();

        // prompt users to enter the number of flashcards
        Text numTxt = new Text("Enter the number of words you want to learn! :");
        TextField textField = new TextField();

        // OK button
        Button okBtn = new Button("OK");

        okBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Main.numberofWord = Integer.parseInt(textField.getText());
            }
        });


        flashcardGUI.getChildren().addAll(numTxt, textField, okBtn);

        return flashcardGUI;
    }
}
