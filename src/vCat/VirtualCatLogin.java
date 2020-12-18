package vCat;

import javafx.geometry.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class VirtualCatLogin extends Application {

    public static void main(String[] args) {
        launch(args);

    }

        @Override
        //this will make a window that will contain everything
        public void start(Stage primaryStage) {
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));

            Scene scene = new Scene(grid, 300, 275);
            primaryStage.setScene(scene);
            primaryStage.show();


            Text scenetitle = new Text("Welcome");
            scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
            grid.add(scenetitle, 0, 0, 2, 1);

            Label userName = new Label("Username:");
            grid.add(userName, 0, 1);

            TextField userTextField = new TextField();
            grid.add(userTextField, 1, 1);

            Label pw = new Label("Password:");
            grid.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            grid.add(pwBox, 1, 2);
            //adds a button to the window
            Button btn = new Button("Sign in");
            HBox hbBtn = new HBox(10);
            hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtn.getChildren().add(btn);
            grid.add(hbBtn, 1, 4);


        }
    }