package com.solvd.jaxb;


import com.solvd.models.Lecturers;
import com.solvd.models.Modules;
import com.solvd.models.Students;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;

public class LecturerJAXB {
    private static final Logger LOGGER = LogManager.getLogger(StudentJAXB.class);

    public void marshal() {
        try {
            Lecturers lecturer = new Lecturers();
            lecturer.setModules(Arrays.asList("Metalexicography","Semantics","Terminology"));
            lecturer.setId(10L);
            lecturer.setAge(28);
            lecturer.setLastname("Gangoooooo");
            lecturer.setFirstName("Maree");
            lecturer.setStartDate(new Date(20180927));
            JAXBContext context = JAXBContext.newInstance(Lecturers.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.marshal(lecturer, new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\Lecturerjaxb.xml"));

        } catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
    public void unmarshal() {
        try {
            JAXBContext context = JAXBContext.newInstance(Lecturers.class);
            Unmarshaller unm = context.createUnmarshaller();
           Lecturers lect = (Lecturers) unm.unmarshal(new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\jaxbxmlfiles\\Lecturerjaxb.xml"));
            LOGGER.info(lect.getFirstName());
            LOGGER.info(lect.getLastname());
            LOGGER.info(lect.getEmail());
            LOGGER.info(lect.getAge());
            LOGGER.info(lect.getModules());
            LOGGER.info(lect.getStartDate());
//
        } catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
}
