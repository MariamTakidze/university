package com.solvd;

import com.solvd.dao.IStudentDAO;
import com.solvd.dao.jdbc.StudentDAO;
import com.solvd.models.Students;

import java.sql.SQLException;

public class Main {
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
        IStudentDAO iStudentDAO = new StudentDAO();
        //get
//        Students student = iStudentDAO.get(1L);
//
//        //update
//        Students updateStudent = new Students(1L,"Giordano","Brunno","lola@123.gmail.com",35);
//        iStudentDAO.update(updateStudent);

        //delete
        Students deleteStudent = iStudentDAO.get(7L);
        iStudentDAO.delete(deleteStudent);

//          System.out.println(deleteStudent.getStudentLastname());
//
//        System.out.println(student.getStudentName());
//        System.out.println(updateStudent.getStudentEmail());

    }
}
