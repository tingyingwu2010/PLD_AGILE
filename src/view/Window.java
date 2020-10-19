package view;

import controler.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class Window extends Application {

    @Override
    public void start(Stage MainFrame) throws Exception {
        initUI(MainFrame);
    }

    private void initUI(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        var scene = new Scene(root, 1650, 1050, Color.WHITE);

        stage.setTitle("DeliveryTool");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);

        Controller controller = new Controller();
        controller.parseMapXML("/Users/basselslim/Documents/4IF/Semestre_1/AGILE/PLD/fichiersXML2020/largeMap.xml");
    }
}
