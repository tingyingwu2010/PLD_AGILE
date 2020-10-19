package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Window extends Application {

    @Override
    public void start(Stage MainFrame) throws Exception {
        initUI(MainFrame);
        // testModel();
    }

    private void initUI(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        var scene = new Scene(root, 1650, 1050, Color.WHITE);

        stage.setTitle("DeliveryTool");
        stage.setScene(scene);
        stage.show();
    }

    private void testModel() {
        Map aMap = new Map();
        Intersection intersection1 = new Intersection(8, 4, 0);
        Intersection intersection2 = new Intersection(15, -5, 1);
        PickUpPoint p1 = new PickUpPoint(intersection1, 60);
        DeliveryPoint d1 = new DeliveryPoint(intersection2, 120);
        Request request = new Request(0, p1, d1);
        Segment segment = new Segment(50, "Rue des Arbres", intersection2);

        List<Segment> listSegments = new ArrayList<>();
        listSegments.add(segment);
        intersection1.setListSegments(listSegments);
        Path path = new Path(listSegments);

        List<Path> listPaths = new ArrayList<>();
        listPaths.add(path);
        Tour tour = new Tour(listPaths);

        System.out.println(aMap);
        System.out.println(intersection1);
        System.out.println(intersection2);
        System.out.println(request);
        System.out.println("Path length: "+ path.getPathLength());
        System.out.println("Path duration: "+ path.getDuration());
        System.out.println("Tour length: "+ tour.getTourLength());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
