package com.solvd.dao.mySql;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;

import java.sql.SQLException;
import java.util.List;

public class StudentDAO extends AbstractMySQLDAO implements IStudentDAO {
    @Override
    public Students get(Long id) throws SQLException {
        return null;
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
