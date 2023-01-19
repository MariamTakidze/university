package com.solvd.dao.jdbc;

import com.solvd.dao.IUniversityDAO;
import com.solvd.models.Universities;

import java.sql.SQLException;
import java.util.List;

public class UniversityDAO extends AbstractMySQLDAO implements IUniversityDAO {
    @Override
    public Universities get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Universities> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Universities universities) throws SQLException {

    }

    @Override
    public void insert(Universities universities) throws SQLException {

    }

    @Override
    public void update(Universities universities) throws SQLException {

    }

    @Override
    public void delete(Universities universities) throws SQLException {

    }
}
