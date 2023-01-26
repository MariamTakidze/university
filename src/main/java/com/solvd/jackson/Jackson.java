package com.solvd.jackson;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.solvd.models.Rectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Jackson {
    private static final Logger LOGGER = LogManager.getLogger(Jackson.class);
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Rectors rector = new Rectors(
                3L,
                "Giordano",
                "Pascal",
                "giordanno.pascal@gmail.com",
                577894567,
                45);
        objectMapper.writeValue(new File("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\target\\rectors.json"),rector);

        String rectJson = "{\"id\":3,\"firstName\":\"Giordano\",\"lastName\":\"Pascal\",\"email\":\"giordanno.pascal@gmail.com\",\"phoneNumber\":577894567,\"age\":45}";
        Rectors rect = objectMapper.readValue(rectJson,Rectors.class);
        LOGGER.info(rect.getFirstName());
        LOGGER.info(rect.getLastName());
        LOGGER.info(rect.getAge());
        LOGGER.info(rect.getEmail());
        LOGGER.info(rect.getPhoneNumber());
    }
}
