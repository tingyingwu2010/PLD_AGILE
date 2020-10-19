package view;

import controler.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class WindowControl {

  GraphicalView Gview = new GraphicalView();
  TextualView Tview = new TextualView();
  controller control = new controller();

    @FXML
    private Canvas canvas;
    @FXML
    private Pane overlay;

    public void LoadMap(ActionEvent event) {

        Gview.drawLines(canvas, overlay);
        Gview.drawShapes(canvas);
    }
}
