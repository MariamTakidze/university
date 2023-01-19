package com.solvd.dao.jdbc;

import com.solvd.dao.ICampusDAO;
import com.solvd.models.Campus;

import java.sql.SQLException;
import java.util.List;

public class CampusDAO extends AbstractMySQLDAO implements ICampusDAO {
    @Override
    public Campus get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Campus> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Campus campus) throws SQLException {

    }

    @Override
    public void insert(Campus campus) throws SQLException {

    }

    @Override
    public void update(Campus campus) throws SQLException {

    }

    @Override
    public void delete(Campus campus) throws SQLException {

    }
}
