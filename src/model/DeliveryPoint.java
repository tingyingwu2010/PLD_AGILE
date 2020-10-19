package model;

import java.util.*;

/**
 * 
 */
public class DeliveryPoint extends Intersection {
    /**
     *
     */
    public int deliveryDuration;

    /**
     * Default constructor
     */
    public DeliveryPoint() {
    }

    public DeliveryPoint(Intersection intersection, int deliveryDuration) {
        this.longitude = intersection.getLongitude();
        this.latitude = intersection.getLatitude();
        this.id = intersection.getId();
        this.deliveryDuration = deliveryDuration;
    }

    public DeliveryPoint(long longitude, long latitude, long id, int deliveryDuration) {
        super(longitude, latitude, id);
        this.deliveryDuration = deliveryDuration;
    }

    /**
     * Getters - Setters
     */
    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(int deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }
}