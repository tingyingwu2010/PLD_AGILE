package controler;

import model.Request;
import view.Window;

import java.util.Map;

public class DeleteState implements State {
    // State of AGILEPLD when receiving the message delete() from InitialState
    // -> Wait for a leftClick
    // -> Return back to initialState when receiving the message rightClick()

    @Override
    public void leftClick(controller controler, Window window, Map map, ListOfCommand listOfCommands, Request r) {
       /* Shape shape = plan.search(p);
        if (shape != null)
            listOfCommands.add(new ReverseCommand(new AddCommand(plan, shape))); */
    }

}