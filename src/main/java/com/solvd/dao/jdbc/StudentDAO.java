package com.solvd.dao.jdbc;
import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.ConnectionPooling;
import com.solvd.utils.DBUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends AbstractMySQLDAO implements IStudentDAO {
    private static final Logger LOGGER = LogManager.getLogger(StudentDAO.class);
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


            student = new Students(studentId, firstName, lastName, email, age);
        }
        ConnectionPooling.getInstance().putback(con);
        return student;
    }

    @Override
    public List<Students> getAll() throws SQLException {
        Connection con = ConnectionPooling.getInstance().retrieve();
        List <Students> studentList = new ArrayList<>();
        Students student = null;

        String sql = "SELECT Student_id,Student_name,Student_surname,student_email, age FROM students ";

        PreparedStatement ps = con.prepareStatement(sql);


        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Long studentId = rs.getLong("Student_id");
            String firstName = rs.getString("Student_name");
            String lastName = rs.getString("Student_surname");
            String email = rs.getString("Student_email");
            int age = rs.getInt("age");


            student = new Students(studentId, firstName, lastName, email, age);
            studentList.add(student);
        }
        ConnectionPooling.getInstance().putback(con);
        return studentList;
    }

    @Override
    public void save(Students students) throws SQLException {

    }

    @Override
    public void insert(Students students) throws SQLException {

    }

    @Override
    public void update(Students students) throws SQLException {
        Connection connection = ConnectionPooling.getInstance().retrieve();
        String SQL = "UPDATE Students set Student_email=? WHERE Student_id=?";

        PreparedStatement ps = connection.prepareStatement(SQL);

        ps.setString(1,students.getStudentEmail());
        ps.setLong(2,students.getId());

        int executeUpdate = ps.executeUpdate();

        if(executeUpdate ==1){
           LOGGER.info ("Student email is updated..");
        }
        ConnectionPooling.getInstance().putback(connection);

    }

    @Override
    public void delete(Students students) throws SQLException {
        String SQL = "DELETE FROM Students WHERE Student_id = ?";
        Connection connection = ConnectionPooling.getInstance().retrieve();
        PreparedStatement ps= connection.prepareStatement(SQL);

        ps.setLong(1,students.getId());
        int executeUpdate = ps.executeUpdate();
        if(executeUpdate ==6){
            LOGGER.info("Student is deleted..");
        }
        ConnectionPooling.getInstance().putback(connection);

    }
}
