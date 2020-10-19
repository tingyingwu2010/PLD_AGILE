package model;

import java.util.*;

/**
 * 
 */
public class Segment {
    /**
     *
     */
    protected int length;
    protected String streetName;
    protected Intersection ends;

    /**
     * Default constructor
     */
    public Segment() {
    }

    public Segment(int length, String streetName, Intersection ends) {
        this.length = length;
        this.streetName = streetName;
        this.ends = ends;
    }

    /**
     * Getters - Setters
     */
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Intersection getEnds() {
        return ends;
    }

    public void setEnds(Intersection ends) {
        this.ends = ends;
    }
}