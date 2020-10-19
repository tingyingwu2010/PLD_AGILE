package model;

import java.util.*;

/**
 * 
 */
public class Segment {
    /**
     *
     */
    protected long destination;
    protected double length;
    protected String name;
    protected long origin;

    /**
     * Default constructor
     */
    public Segment(long destination, double length, String name, long origin) {
        this.destination = destination;
        this.length = length;
        this.name = name;
        this.origin = origin;
    }

    public long getDestination() {
        return destination;
    }

    public void setDestination(long destination) {
        this.destination = destination;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrigin() {
        return origin;
    }

    public void setOrigin(long origin) {
        this.origin = origin;
    }

    public String toString(){
        return "Segment :\n Destination : " + this.destination + "\n Length : " + this.length + "\n Name : " + this.name + "\n Origin : " + this.origin + "\n";
    }
}