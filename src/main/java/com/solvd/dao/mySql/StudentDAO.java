package com.solvd.dao.mySql;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAO extends AbstractMySQLDAO implements IStudentDAO {
    @Override
    public Students get(Long id) throws SQLException {
        Connection con = DBUtil.getConnection();
        Students student = null;

        String sql = "SELECT Student_id, Student_name, Student_surname, Student_email,age FROM students WHERE Student_id = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            long student_id = rs.getInt("Student_id");
            String firstName = rs.getString("Student_name");
            String lastName = rs.getString("Student_surname");
            String email = rs.getString("Student_email");
            int age = rs.getInt("age");


           student = new Students(student_id, firstName, lastName, email, age);
        }

       DBUtil.closeResultSet(rs);
        DBUtil.closePreparedStatement(ps);
        DBUtil.closeConnection(con);
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
