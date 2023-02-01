package com.solvd;

import com.solvd.dao.IStudentDAO;
import com.solvd.dao.jdbc.StudentDAO;
import com.solvd.dao.jdbc.StudentDAOPS;
//import com.solvd.dao.mybatis.StudentsDAO;
import com.solvd.dao.mybatis.StudentsDAO;
import com.solvd.models.Students;
import com.solvd.services.IStudentsService;
import com.solvd.services.serviceimpl.StudentServiceImpl;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.reflection.ReflectionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws SQLException, PersistenceException {
//        Connection con = DBUtil.getConnection();
//
//        if (con != null) {
//            System.out.println("Database connection successful!");
//        }
//        else{
//            System.out.println("Failed to connect.");
//        }
//


        //////////////MyBatis --------------------------------------------------------------

       IStudentsService student = new StudentServiceImpl();
        Students students = student.get(1L);
        LOGGER.info(students.getStudentName());
        LOGGER.info(students.getStudentLastname());
        LOGGER.info(students.getStudentEmail());
        List<Students> stu = student.getAll();
        stu.forEach(System.out::println);

        //update
//        Students updateStudent = new Students(5L,"Gio","Brunno","lola@123.gmail.com",35);
//        student.update(updateStudent);

        //delete


//        StudentsDAO studentsDAO =  new StudentsDAO();
//        //getById
//         Students students = studentsDAO.get(3L);
//         LOGGER.info(students);





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
//        IStudentDAO iStudentDAO = new StudentDAO();
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



        //-----------------------------------------------------------------------------


    }
}
