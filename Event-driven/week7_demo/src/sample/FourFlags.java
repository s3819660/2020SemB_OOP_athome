package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FourFlags extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image englandImg = new Image("england.png");
        Image canadaImg = new Image("canada.png");

        ImageView imageview = new ImageView();

        imageview.setImage(englandImg);

        imageview.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(imageview.getImage() != canadaImg)
                    imageview.setImage(canadaImg);
                else
                    imageview.setImage(englandImg);
            }
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(imageview);

        stage.setTitle("Simple game");
        stage.setScene(new Scene(pane));
        stage.show();
    }
}
