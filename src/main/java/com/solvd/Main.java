package com.solvd;

import com.solvd.utils.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DBUtil.getConnection();

        if (con != null) {
            System.out.println("Database connection successful!");
        }
        else{
            System.out.println("Failed to connect.");
        }
    }
}
