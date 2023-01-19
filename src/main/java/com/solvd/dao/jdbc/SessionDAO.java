package com.solvd.dao.jdbc;

import com.solvd.dao.ISessionDAO;
import com.solvd.models.Sessions;

import java.sql.SQLException;
import java.util.List;

public class SessionDAO extends AbstractMySQLDAO implements ISessionDAO {
    @Override
    public Sessions get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Sessions> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Sessions sessions) throws SQLException {

    }

    @Override
    public void insert(Sessions sessions) throws SQLException {

    }

    @Override
    public void update(Sessions sessions) throws SQLException {

    }

    @Override
    public void delete(Sessions sessions) throws SQLException {

    }
}
