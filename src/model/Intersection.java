package model;

import java.util.*;

/**
 * 
 */
public class Intersection {
    /**
     *
     */
    protected double longitude;
    protected double latitude;
    protected long id;
    protected List<Segment> listSegments;

    /**
     * Default constructor
     */
    public Intersection() {
    }

    public Intersection(double longitude, double latitude, long id) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.id = id;
    }

    /**
     * Getters - Setters
     */
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

    public long getId() {
        return id;
    }

    public List<Segment> getListSegments() {
        return listSegments;
    }

    public void setListSegments(List<Segment> listSegments) {
        this.listSegments = listSegments;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", id=" + id +
                ", listSegments=" + listSegments +
                '}';
    }
}