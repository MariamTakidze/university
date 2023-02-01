package com.solvd.services.serviceimpl;

import com.solvd.dao.IStudentDAO;
import com.solvd.models.Students;
import com.solvd.services.IBaseService;
import com.solvd.services.IStudentsService;
import com.solvd.utils.MyBatisDAOFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements IStudentsService {
    private static final Logger LOGGER = LogManager.getLogger(StudentServiceImpl.class);
    Students students;
    @Override
    public Students get(Long id) {
        try (SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession()) {
       IStudentDAO studentDao = sqlSession.getMapper(IStudentDAO.class);
            students = studentDao.get(id);
        } catch (SQLException e) {
            LOGGER.error("SQLException", e);
        }
        return students;
    }

    @Override
    public List<Students> getAll() {
        List<Students> studentsList = null;
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try {
            IStudentDAO studentDao = sqlSession.getMapper(IStudentDAO.class);
            studentsList = studentDao.getAll();
        } catch (SQLException e) {
            LOGGER.error("SQLException", e);
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }

        return studentsList;
    }


//    @Override
//    public Students get(Long id) {
//        SqlSession session = MyBatisDAOFactory.getSqlSessionFactory().openSession();
//        Students students;
//        try {
//
//      IStudentsService StudentService = session.getMapper(IStudentsService.class);
//            students= StudentService.get(id);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            session.rollback();
//            session.close();
//        }
//        return students;
//    }

//    @Override
//    public List<Students> getAll() throws SQLException {
//        SqlSession session = MyBatisDAOFactory.getSqlSessionFactory().openSession();
//        List <Students> students = session.selectList();
//        return students;
//    }

    @Override
    public void save(Students students) throws SQLException {

    }

    @Override
    public void insert(Students students) throws SQLException {

    }

    @Override
    public void update(Students students) throws SQLException {
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();
        try {
            IStudentDAO studentDao = sqlSession.getMapper(IStudentDAO.class);
            studentDao.update(students);
            sqlSession.commit();
            LOGGER.info("Student is successfully updated");
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }

    }


    public void delete(Long id) throws SQLException {
        SqlSession sqlSession = MyBatisDAOFactory.getSqlSessionFactory().openSession();

        try {
            IStudentDAO studentDao = sqlSession.getMapper(IStudentDAO.class);
            studentDao.delete(id);
            sqlSession.commit();
            LOGGER.info("Student is successfully deleted");
        }finally {
            sqlSession.rollback();
            sqlSession.close();
        }

    }
}
