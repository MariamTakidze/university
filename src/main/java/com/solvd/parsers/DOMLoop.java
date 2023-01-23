package com.solvd.parsers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class DOMLoop {
    private static final Logger LOGGER = LogManager.getLogger(DOMLoop.class);
    private static final String FILENAME = "C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\xmlFiles\\University.xml";
    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            // read from a project's resources folder
            Document doc = db.parse(FILENAME);

            doc.getDocumentElement().normalize();
            LOGGER.info("Root Element :" + doc.getDocumentElement().getNodeName());
            LOGGER.info("------");

            if (doc.hasChildNodes()) {
                printNode(doc.getChildNodes());
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

        private static void printNode(NodeList nodeList) {

            for (int count = 0; count < nodeList.getLength(); count++) {

                Node tempNode = nodeList.item(count);

                // make sure it's element node.
                if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                    // get node name and value
                    LOGGER.info("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
                    LOGGER.info("Node Value =" + tempNode.getTextContent());

                    if (tempNode.hasAttributes()) {

                        // get attributes names and values
                        NamedNodeMap nodeMap = tempNode.getAttributes();
                        for (int i = 0; i < nodeMap.getLength(); i++) {
                            Node node = nodeMap.item(i);
                            LOGGER.info("attr name : " + node.getNodeName());
                            LOGGER.info("attr value : " + node.getNodeValue());
                        }

                    }

                    if (tempNode.hasChildNodes()) {
                        // loop again if has child nodes
                        printNode(tempNode.getChildNodes());
                    }

                    LOGGER.info("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

                }
            }

        }

//        // read file from project resource's folder.
//        private static InputStream readXmlFileIntoInputStream(final String fileName) {
//            return DOMLoop.class.getClassLoader().getResourceAsStream(fileName);
//    }

}
