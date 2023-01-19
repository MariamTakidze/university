package com.solvd.dao.jdbc;

import com.solvd.dao.ICourseDAO;
import com.solvd.models.Courses;

import java.sql.SQLException;
import java.util.List;

public class CourseDAO extends AbstractMySQLDAO implements ICourseDAO {
    @Override
    public Courses get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Courses> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Courses courses) throws SQLException {

    }

    @Override
    public void insert(Courses courses) throws SQLException {

    }

    @Override
    public void update(Courses courses) throws SQLException {

    }

    @Override
    public void delete(Courses courses) throws SQLException {

    }
}
