package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class WindowControl {
    public void LoadMap(ActionEvent event) {
        drawLines();;
    }

    @FXML
    private Canvas canvas;

    public void drawLines(){
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.BLACK);
        gc.strokeRect(1,1,599,599);
        gc.strokeLine(100,100,300,300);
        gc.strokeLine(100,100,200,110);
        gc.strokeLine(300,80,200,110);
        gc.strokeLine(480,230,200,110);
        gc.fillOval(95,95,10,10);
        gc.fillOval(295,295,10,10);
        gc.fillOval(195,105,10,10);
        gc.fillOval(235,325,10,10);
        gc.fillOval(475,235,10,10);
    }
}
