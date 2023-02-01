package com.solvd.dao.mybatis;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.MyBatisDAOFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class StudentsDAO {
    private static final Logger LOGGER = LogManager.getLogger(StudentsDAO.class);
    public Students get(Long id){
        SqlSession session = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try {
            IStudentDAO iStudentDAO = session.getMapper(IStudentDAO.class);
            return iStudentDAO.get(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
