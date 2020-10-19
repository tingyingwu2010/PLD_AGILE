package model;

import java.sql.Time;
import java.util.*;

/**
 * 
 */
public class Request extends Observable {
    /**
     *
     */
    protected String deliveryAddress;
    protected String pickupAddress;
    protected Time deliveryDuration;
    protected Time pickupDuration;
    /**
     * Default constructor
     */
    public Request() {
    }

    public Request(String deliveryAddress, String pickupAddress, Time deliveryDuration , Time pickupDuration) {
    }

}