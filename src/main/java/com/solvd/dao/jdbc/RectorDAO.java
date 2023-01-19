package com.solvd.dao.jdbc;

import com.solvd.dao.IRectorDAO;
import com.solvd.models.Rectors;

import java.sql.SQLException;
import java.util.List;

public class RectorDAO extends AbstractMySQLDAO implements IRectorDAO {
    @Override
    public Rectors get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Rectors> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Rectors rectors) throws SQLException {

    }

    @Override
    public void insert(Rectors rectors) throws SQLException {

    }

    @Override
    public void update(Rectors rectors) throws SQLException {

    }

    @Override
    public void delete(Rectors rectors) throws SQLException {

    }
}
