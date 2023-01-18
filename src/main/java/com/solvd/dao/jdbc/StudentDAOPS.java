package com.solvd.dao.jdbc;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOPS extends AbstractMySQLDAO implements IStudentDAO {
    @Override
    public Students get(Long id) throws SQLException {
        Connection con = DBUtil.getConnection();
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
//            student = new Students(studentId, firstName, lastName, email, age);
//            student.setId(studentId);
//            student.setStudentName(firstName);
//            student.setStudentLastname(lastName);
//            student.setStudentEmail(email);
//            student.setAge(age);
        }

//       DBUtil.closeResultSet(rs);
//        DBUtil.closePreparedStatement(ps);
//        DBUtil.closeConnection(con);

        return student;

    }

    @Override
    public List<Students> getAll() throws SQLException {


        Connection con = DBUtil.getConnection();
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
        String SQL = "UPDATE Students set Student_email=? WHERE Student_id=?";
        Connection connection = DBUtil.getConnection();
        PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1,students.getStudentEmail());
            ps.setLong(2,students.getId());

            int executeUpdate = ps.executeUpdate();

            if(executeUpdate ==1){
                System.out.println("Student email is updated..");
            }

    }

    @Override
    public void delete(Students students) throws SQLException {
        String SQL = "DELETE FROM Students WHERE Student_id = ?";
        Connection connection = DBUtil.getConnection();
        PreparedStatement ps= connection.prepareStatement(SQL);

         ps.setLong(1,students.getId());
         int executeUpdate = ps.executeUpdate();
        if(executeUpdate ==7){
            System.out.println("Student is deleted..");
        }
        DBUtil.closePreparedStatement(ps);
        DBUtil.closeConnection(connection);


    }
}
