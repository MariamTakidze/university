package com.solvd.jaxb;

import com.solvd.models.Students;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;

public class StudentJAXB {
    private static final Logger LOGGER = LogManager.getLogger(StudentJAXB.class);

    public void marshal() {
        try {
            Students student = new Students(9L, "Maree", "Gangoo", "maregango18@gmail.com", 28);
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.marshal(student, new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\studjaxb.xml"));

        } catch (JAXBException e) {
            LOGGER.error(e);
        }
    }

    public void unmarshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Unmarshaller unm = context.createUnmarshaller();
            Students stu = (Students) unm.unmarshal(new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\studentjaxb.xml"));
            LOGGER.info(stu.getStudentName());
            LOGGER.info(stu.getStudentLastname());
            LOGGER.info(stu.getStudentEmail());
            LOGGER.info(stu.getAge());
//
        } catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
//    public static Students unmarshal() {
//        Students stu = null;
//        try {
//            JAXBContext context = JAXBContext.newInstance(Students.class);
//            Unmarshaller unm = context.createUnmarshaller();
//           stu = (Students) unm.unmarshal(new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\studentjaxb.xml"));
//            LOGGER.info(stu.getStudentLastname());
//
//        } catch (JAXBException e) {
//            LOGGER.error(e);
//        }
//
//        return stu;
//    }
//
}
