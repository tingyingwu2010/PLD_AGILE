package controler;
import model.Map;

import java.util.*;

/**
 * 
 */
public class controller {

    ListOfCommand listOfCommand;
    State currentState;
    Map map;


    protected final InitialState initialState = new InitialState();
    protected final RequestStatePickUpPoint requestStatePickUpPoint = new RequestStatePickUpPoint();
    protected final RequestStateDeliveryPoint requestStateDeliveryPoint = new RequestStateDeliveryPoint();
    protected final RequestStateConfirmation requestStateConfirmation = new RequestStateConfirmation();
    protected final DeleteState deleteState = new DeleteState();

    /**
     * Default constructor
     */
    public controller(Map newMap) {
        listOfCommand = new ListOfCommand();
        currentState = initialState;
        map = newMap;
    }

    protected void setCurrentstate(State newState) {
        currentState = newState;
    }
}

