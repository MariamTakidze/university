package com.solvd.dao.jdbc;

import com.solvd.dao.ILecturerDAO;
import com.solvd.models.Lecturers;

import java.sql.SQLException;
import java.util.List;

public class LecturerDAO extends AbstractMySQLDAO implements ILecturerDAO {
    @Override
    public Lecturers get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Lecturers> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Lecturers lecturers) throws SQLException {

    }

    @Override
    public void insert(Lecturers lecturers) throws SQLException {

    }

    @Override
    public void update(Lecturers lecturers) throws SQLException {

    }

    @Override
    public void delete(Lecturers lecturers) throws SQLException {

    }
}
