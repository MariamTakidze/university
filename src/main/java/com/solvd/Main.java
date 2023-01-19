package com.solvd;

import com.solvd.dao.IStudentDAO;
import com.solvd.dao.jdbc.StudentDAO;
import com.solvd.dao.jdbc.StudentDAOPS;
import com.solvd.models.Students;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws SQLException {
//        Connection con = DBUtil.getConnection();
//
//        if (con != null) {
//            System.out.println("Database connection successful!");
//        }
//        else{
//            System.out.println("Failed to connect.");
//        }
//
//        IStudentDAO iStudentDAO = new StudentDAOPS();


        //get
//        Students student = iStudentDAO.get(1L);
//
//        //update
//        Students updateStudent = new Students(1L,"Giordano","Brunno","lola@123.gmail.com",35);
//        iStudentDAO.update(updateStudent);

        //delete
//        Students deleteStudent = iStudentDAO.get(7L);
//        iStudentDAO.delete(deleteStudent);

        //getall

//            List<Students> studentsList = iStudentDAO.getAll();
//            studentsList.forEach(System.out::println);

//         System.out.println(deleteStudent.getStudentLastname());
//        System.out.println(student.getStudentName());
//        System.out.println(updateStudent.getStudentEmail());
//        System.out.println(studentsList);


//        --------------------------with pooling
        IStudentDAO iStudentDAO = new StudentDAO();
        //get
//        Students student =iStudentDAO.get(3L);


        //getAll
//        List<Students> studentsList = iStudentDAO.getAll();
//        studentsList.forEach(System.out::println);
//        for (Students s: iStudentDAO.getAll()) {
//            LOGGER.info(s);
//        }

        //update
//        Students updateStudent = new Students(1L,"Giordano","Brunno","lolita@123.gmail.com",35);
//        iStudentDAO.update(updateStudent);

        //delete
//        iStudentDAO.delete(iStudentDAO.get(6L));



    }
}
