package model;

import java.util.*;

/**
 * 
 */
public class Path {
    /**
     *
     */
    protected int pathLength;
    protected List<Segment> listSegments;

    /**
     * Default constructor
     */
    public Path() {
    }

    public Path(List<Segment> listSegments) {
        this.listSegments = listSegments;
        this.pathLength = 0;
        for(Segment s: listSegments) {
            this.pathLength += s.getLength();
        }
    }

    /**
     * Getters - Setters
     */
    public int getPathLength() {
        return pathLength;
    }

    public List<Segment> getListSegments() {
        return listSegments;
    }

    public int getDuration() {
        return (int) (((double) pathLength/15.0)*3.6);
    }
}