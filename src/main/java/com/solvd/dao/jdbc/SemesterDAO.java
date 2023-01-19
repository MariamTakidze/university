package com.solvd.dao.jdbc;

import com.solvd.dao.ISemesterDAO;
import com.solvd.models.Semesters;

import java.sql.SQLException;
import java.util.List;

public class SemesterDAO extends AbstractMySQLDAO implements ISemesterDAO {
    @Override
    public Semesters get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Semesters> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Semesters semesters) throws SQLException {

    }

    @Override
    public void insert(Semesters semesters) throws SQLException {

    }

    @Override
    public void update(Semesters semesters) throws SQLException {

    }

    @Override
    public void delete(Semesters semesters) throws SQLException {

    }
}
