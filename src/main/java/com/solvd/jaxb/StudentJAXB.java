package com.solvd.jaxb;

import com.solvd.models.Students;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;

public class StudentJAXB {
    public void marshal() {
        try {
            Students student = new Students(9L, "Maree", "Gangoo", "maregango18@gmail.com", 28);
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.marshal(student, new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\studentjaxb.xml"));
        } catch (PropertyException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
    public void unmarshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Unmarshaller unm = context.createUnmarshaller();
            Students stu = (Students) unm.unmarshal(new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\studentjaxb.xml"));
            System.out.println(stu.getStudentLastname());
        } catch (PropertyException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
