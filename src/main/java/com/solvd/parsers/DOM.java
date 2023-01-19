package com.solvd.parsers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOM {
    private static final Logger LOGGER = LogManager.getLogger(DOM.class);
    private static final String FILENAME = "C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\xmlFiles\\Students.xml";

    public static void main(String[] args) {
        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            doc.getDocumentElement().normalize();

           LOGGER.info("Root Element :" + doc.getDocumentElement().getNodeName());
           LOGGER.info("------");
            // get <student>
            NodeList list = doc.getElementsByTagName("student");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    // get student's attribute
                    String id = element.getAttribute("id");
                    // get text
                    String firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
                    String lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
                    String email = element.getElementsByTagName("email").item(0).getTextContent();
                    String age = element.getElementsByTagName("age").item(0).getTextContent();

                    LOGGER.info("Current Element :" + node.getNodeName());
                    LOGGER.info("Staff Id : " + id);
                    LOGGER.info("First Name : " + firstname);
                    LOGGER.info("Last Name : " + lastname);
                    LOGGER.info("email : " + email);
                    LOGGER.info("age : " + age);
                }
            }

                } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}
