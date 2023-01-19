package com.solvd.dao.jdbc;

import com.solvd.dao.IModuleDAO;
import com.solvd.models.Modules;

import java.sql.SQLException;
import java.util.List;

public class ModuleDAO extends AbstractMySQLDAO implements IModuleDAO {
    @Override
    public Modules get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Modules> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Modules modules) throws SQLException {

    }

    @Override
    public void insert(Modules modules) throws SQLException {

    }

    @Override
    public void update(Modules modules) throws SQLException {

    }

    @Override
    public void delete(Modules modules) throws SQLException {

    }
}
