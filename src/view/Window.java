package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Window extends Application {

    @Override
    public void start(Stage MainFrame) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        MainFrame.setTitle("Kante");

        MainFrame.setScene(new Scene(root, 1920, 1080));
        MainFrame.setResizable(false);
        MainFrame.show();

        Group map = new Group();
        Line line = new Line(40,100,10,400);
        map.getChildren().add(line);


    }


    public static void main(String[] args) {
        launch(args);
    }
}
