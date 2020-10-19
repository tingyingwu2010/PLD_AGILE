package controler;

import model.Intersection;
import model.Map;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import model.Segment;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


import java.util.*;

/**
 * 
 */
public class Controller {

    /**
     * Default constructor
     */
    public Controller() {
    }

    public Map parseMapXML(String pathNameXMLFile){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        ArrayList<Intersection> listIntersection = new ArrayList<Intersection>();
        ArrayList<Segment> listSegment = new ArrayList<Segment>();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File fileXML = new File(pathNameXMLFile);
            Document xml;

            xml = builder.parse(fileXML);
            Element root = xml.getDocumentElement();

            NodeList nodes = root.getChildNodes();
            int nbNode = nodes.getLength();
            for(int i = 0; i < nbNode; i++){
                Node n = nodes.item(i);
                String nodeName = n.getNodeName();

                if(n.getAttributes() != null && n.getAttributes().getLength() > 0){

                    NamedNodeMap att = n.getAttributes();
                    int nbAtt = att.getLength();

                    if(nodeName == "intersection")
                    {
                        long id = Long.parseLong(att.item(0).getNodeValue());
                        double latitude = Double.parseDouble(att.item(1).getNodeValue());
                        double longitude = Double.parseDouble(att.item(2).getNodeValue());
                        Intersection intersection = new Intersection(id, latitude, longitude);
                        listIntersection.add(intersection);
                    }

                    if(nodeName == "segment")
                    {
                        long destination = Long.parseLong(att.item(0).getNodeValue());
                        double length = Double.parseDouble(att.item(1).getNodeValue());
                        String name = att.item(2).getNodeValue();
                        long origin = Long.parseLong(att.item(3).getNodeValue());
                        Segment segment = new Segment(destination, length, name, origin);
                        listSegment.add(segment);
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map mapParsed = new Map(listIntersection, listSegment);
        System.out.println("Map créée");
        mapParsed.display();
        return mapParsed;
    }
}