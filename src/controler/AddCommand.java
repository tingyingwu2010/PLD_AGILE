package controler;

import model.Map;
import model.Request;

public class AddCommand implements Command {

    private Map map;
    private Request requet;

    /**
     * Create the command which adds the request r to the plan m
     * @param m the map to which f is added
     * @param r the request added to m
     */
    public AddCommand(Map m, Request r){
        this.map = m;
        this.requet = r;
    }

    @Override
    public void doCommand() {
        //map.add(requet);
    }

    @Override
    public void undoCommand() {
        //map.remove(requet;
    }
}
