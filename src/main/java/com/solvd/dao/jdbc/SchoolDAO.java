package com.solvd.dao.jdbc;

import com.solvd.dao.ISchoolDAO;
import com.solvd.models.Schools;

import java.sql.SQLException;
import java.util.List;

public class SchoolDAO extends AbstractMySQLDAO implements ISchoolDAO {
    @Override
    public Schools get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Schools> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Schools schools) throws SQLException {

    }

    @Override
    public void insert(Schools schools) throws SQLException {

    }

    @Override
    public void update(Schools schools) throws SQLException {

    }

    @Override
    public void delete(Schools schools) throws SQLException {

    }
}
