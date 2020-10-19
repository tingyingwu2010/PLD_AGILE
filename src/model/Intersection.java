package model;

import java.util.*;

/**
 * 
 */
public class Intersection {
    /**
     *
     */
    protected long id;
    protected double longitude;
    protected double latitude;
    protected List<Segment> listSegment;


    /**
     * Default constructor
     */
    public Intersection() {
    }

    public Intersection(long id, double latitude, double longitude, List<Segment> listSegment) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.listSegment = listSegment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<Segment> getListSegment() {
        return listSegment;
    }

    public void setListSegment(List<Segment> listSegment) {
        this.listSegment = listSegment;
    }

    /*public String toString(){
        return "Intersection :\n Id : " + this.id + "\n Latitude : " + this.latitude + "\n Longitude : " + this.longitude + "\n";
    }*/
}