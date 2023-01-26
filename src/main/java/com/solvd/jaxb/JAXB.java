package com.solvd.jaxb;

import com.solvd.models.Students;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class JAXB {
    public static void main(String[] args) throws JAXBException, IOException {
//        StudentJAXB studentJAXB = new StudentJAXB();
//        studentJAXB.marshal();
//        studentJAXB.unmarshal();
        LecturerJAXB lecturerJAXB = new LecturerJAXB();
        lecturerJAXB.marshal();
        lecturerJAXB.unmarshal();


    }
}
