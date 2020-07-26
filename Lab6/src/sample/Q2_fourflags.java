package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q2_fourflags {

    public String title = "Four Flags";
    public GridPane mainScene() {
        GridPane fourflagsPane = new GridPane();

        // 1st row
//        Image englandImg = new Image("england.png");
//        ImageView englandView = new ImageView();
//        englandView.setImage(englandImg);
//        fourflagsPane.add(englandView, 0, 0);
//
//        Image canadaImg = new Image("canada.png");
//        ImageView canadaView = new ImageView();
//        canadaView.setImage(canadaImg);
//        fourflagsPane.add(canadaView, 0, 1);
//
//
//        // 2nd row
//        Image vietnamImg = new Image("vietnam.png");
//        ImageView vietnamView = new ImageView();
//        vietnamView.setImage(vietnamImg);
//        fourflagsPane.add(vietnamView, 1, 0);
//
//        Image usImg = new Image("us.png");
//        ImageView usView = new ImageView();
//        usView.setImage(usImg);
//        fourflagsPane.add(usView, 1, 1);

        // using for loop
        final String[][] arr = {
                {"england.png", "canada.png"},
                {"vietnam.png", "us.png"}
        };

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                String path = "./resources/flags/" + arr[i][j];
                    Image img = new Image(new File(path).toURI().toString());
                ImageView view = new ImageView();
                view.setImage(img);
                fourflagsPane.add(view, i, j);
            }
        }

        // using FileInputStream
//        try {
//            FileInputStream imageStream1 =
//                    new FileInputStream("england.png"); // c:/Users/ADMIN/IdeaProjects/2020/OOP/GUI/Lab6/src/england.png
//            Image england = new Image(imageStream1);
//            fourflagsPane.add(new ImageView(england), 0, 0);
//
//            FileInputStream imageStream2 =
//                    new FileInputStream("canada.png"); // c:/Users/ADMIN/IdeaProjects/2020/OOP/GUI/Lab6/src/canada.png
//            Image canada = new Image(imageStream2);
//            fourflagsPane.add(new ImageView(canada), 1, 0);
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }

        return fourflagsPane;
    }
}
