package com.solvd.dao.jdbc;

import com.solvd.dao.IDegreeLevelDAO;
import com.solvd.models.DegreeLevels;

import java.sql.SQLException;
import java.util.List;

public class DegreeLevelDAO extends AbstractMySQLDAO implements IDegreeLevelDAO {
    @Override
    public DegreeLevels get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<DegreeLevels> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(DegreeLevels degreeLevels) throws SQLException {

    }

    @Override
    public void insert(DegreeLevels degreeLevels) throws SQLException {

    }

    @Override
    public void update(DegreeLevels degreeLevels) throws SQLException {

    }

    @Override
    public void delete(DegreeLevels degreeLevels) throws SQLException {

    }
}
