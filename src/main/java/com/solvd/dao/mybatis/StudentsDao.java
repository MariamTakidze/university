package com.solvd.dao.mybatis;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.utils.MyBatisDAOFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.ibatis.exceptions.PersistenceException;
import java.sql.SQLException;
import java.util.List;

public class StudentsDao {
//    private static final SqlSession SQLSESSION = MyBatisDAOFactory.getSqlSessionFactory().openSession();
    private static final Logger LOGGER = LogManager.getLogger(StudentsDao.class);
    public Students get(Long id) throws SQLException{
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try {
            IStudentDAO iStudentDAO = sqlSession.getMapper(IStudentDAO.class);
            return iStudentDAO.get(id);
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }
    public List<Students> getAll() throws SQLException {

        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try {
            IStudentDAO studentDao = sqlSession.getMapper(IStudentDAO.class);
            return studentDao.getAll();
        } finally {
          sqlSession.rollback();
          sqlSession.close();
        }



    }

    public void update(Students students) throws SQLException{
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try{
         IStudentDAO studentDao =sqlSession.getMapper(IStudentDAO.class);
         studentDao.update(students);
         sqlSession.commit();
         LOGGER.info("update info please");

        }finally {
           sqlSession.rollback();
            sqlSession.close();
        }
    }

    public void delete(Students students) throws SQLException{
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try{
            IStudentDAO studentDao =sqlSession.getMapper(IStudentDAO.class);
            studentDao.delete(students);
            sqlSession.commit();
            LOGGER.info("delete info please");

        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

}
