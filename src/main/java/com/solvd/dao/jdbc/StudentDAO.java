package com.solvd.dao.jdbc;
import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.ConnectionPooling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO extends AbstractMySQLDAO implements IStudentDAO {
    @Override
    public Students get(Long id) throws SQLException {
    Connection con= ConnectionPooling.getInstance().retrieve();
        Students student = null;

        String sql = "SELECT * FROM students WHERE Student_id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Long studentId = rs.getLong("Student_id");
            String firstName = rs.getString("Student_name");
            String lastName = rs.getString("Student_surname");
            String email = rs.getString("Student_email");
            int age = rs.getInt("age");
            System.out.println(lastName);

            student = new Students(studentId, firstName, lastName, email, age);
        }
        return student;
    }

    @Override
    public List<Students> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Students students) throws SQLException {

    }

    @Override
    public void insert(Students students) throws SQLException {

    }

    @Override
    public void update(Students students) throws SQLException {

    }

    @Override
    public void delete(Students students) throws SQLException {

    }
}
