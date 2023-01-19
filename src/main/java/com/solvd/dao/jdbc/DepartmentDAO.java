package com.solvd.dao.jdbc;

import com.solvd.dao.IDepartmentDAO;
import com.solvd.models.Departments;

import java.sql.SQLException;
import java.util.List;

public class DepartmentDAO extends AbstractMySQLDAO implements IDepartmentDAO {
    @Override
    public Departments get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Departments> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Departments departments) throws SQLException {

    }

    @Override
    public void insert(Departments departments) throws SQLException {

    }

    @Override
    public void update(Departments departments) throws SQLException {

    }

    @Override
    public void delete(Departments departments) throws SQLException {

    }
}
