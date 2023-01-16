package com.solvd.dao.mySql;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public abstract class AbstractMySQLDAO {
    private static final Logger LOGGER = LogManager.getLogger(AbstractMySQLDAO.class);
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Class Not found");
        }
    }
}
