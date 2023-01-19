package com.solvd.dao.jdbc;

import com.solvd.dao.IAcademicRankDAO;
import com.solvd.models.AcademicRank;

import java.sql.SQLException;
import java.util.List;

public class AcademicRankDAO extends AbstractMySQLDAO implements IAcademicRankDAO {
    @Override
    public AcademicRank get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<AcademicRank> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(AcademicRank academicRank) throws SQLException {

    }

    @Override
    public void insert(AcademicRank academicRank) throws SQLException {

    }

    @Override
    public void update(AcademicRank academicRank) throws SQLException {

    }

    @Override
    public void delete(AcademicRank academicRank) throws SQLException {

    }
}
