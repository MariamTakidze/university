package com.solvd;

import com.solvd.dao.IStudentDAO;
import com.solvd.dao.mySql.StudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

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
        Students student = iStudentDAO.get(1L);
        System.out.println(student);
    }
}
