package controler;

import model.Request;
import view.Window;

import java.util.*;

/**
 * 
 */
public interface State {
    public void leftClick(controller controler, Window window, Map map, ListOfCommand listOfCommand, Request r);
}