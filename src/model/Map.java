package model;

import java.util.*;

/**
 * check for java beans for Observable
 */
public class Map extends Observable {
    /**
     *
     */
    protected List<Request> listRequests;
    protected List<Intersection> listIntersections;

    /**
     * Default constructor
     */
    public Map() {
    }


    /**
     * Getters - Setters
     */
    public List<Request> getListRequests() {
        return listRequests;
    }

    public void setListRequests(List<Request> listRequests) {
        this.listRequests = listRequests;
    }

    public List<Intersection> getListIntersections() {
        return listIntersections;
    }

    public void setListIntersections(List<Intersection> listIntersections) {
        this.listIntersections = listIntersections;
    }


    @Override
    public String toString() {
        return "Map{" +
                "listRequests=" + listRequests +
                ", listIntersections=" + listIntersections +
                '}';
    }
}