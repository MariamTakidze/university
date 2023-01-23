package com.solvd.jaxb;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class JAXB {
    public static void main(String[] args) throws JAXBException, IOException {
        StudentJAXB studentJAXB = new StudentJAXB();
        studentJAXB.marshal();
        studentJAXB.unmarshal();
    }
}
