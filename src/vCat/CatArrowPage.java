package vCat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CatArrowPage extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Creating an image
        Image image = new Image(new FileInputStream("/Users/davisklevgard/Documents/Pics/Cat.jpg"));

        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(50);
        imageView.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(45);
        imageView.setFitWidth(45);

        //Setting the pressure ratio of the image view
        imageView.setPreserveRatio(true);

        //Creating a group object
        Group root = new Group(imageView);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 500);

        //Setting title to the Stage
        stage.setTitle("Virtual Cat");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Adding scene to the stage
        stage.setScene(scene);
        stage.show();

        //Displaying the contents of he stage
        stage.show();

    }

        private EventHandler<KeyEvent> keyListener = moveCat -> {
            if ((moveCat.getCode() == KeyCode.UP) || (moveCat.getCode() == KeyCode.DOWN) ||
                    (moveCat.getCode() == KeyCode.RIGHT) || (moveCat.getCode() == KeyCode.LEFT));

            };
    public static void main(String[] args) {
        launch(args);

    }
}
