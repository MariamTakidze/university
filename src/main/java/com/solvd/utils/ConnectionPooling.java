package com.solvd.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
import org.apache.logging.log4j.*;
public class ConnectionPooling {


    private static final Logger LOGGER = LogManager.getLogger(ConnectionPooling.class);
        private static final int CON_POOL_SIZE = 5;
        private static Properties p = new Properties();
        private static String userName;
        private static String url;
        private static String password;
        private Vector<Connection> conPool = new Vector<>(CON_POOL_SIZE, 1);
        private Vector<Connection> activeConnections = new Stack<>();
        private ConnectionPooling() {
            for (int i = 0; i < CON_POOL_SIZE; i++) {
                Connection connection = null;
                try {
                    connection = DriverManager.getConnection(url, userName, password);
                } catch (SQLException e) {
                    LOGGER.info(e);
                }
                conPool.add(connection);
            }
        }
        private static ConnectionPooling instance = null;
        public static ConnectionPooling getInstance() {
            if (instance == null) instance = new ConnectionPooling();
            return instance;
        }
        static {
            try (FileInputStream f = new FileInputStream("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\mySQLcreds.properties")) {
                p.load(f);
            } catch (IOException e) {
                LOGGER.info(e);
            }
            url = p.getProperty("db.url");
            userName = p.getProperty("db.username");
            password = p.getProperty("db.password");
        }
        private Connection getConnection() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, userName, password);
            } catch (Exception e) {
                LOGGER.info(e);
            }
            return conn;
        }
        public synchronized Connection retrieve() {
            Connection newConn = null;
            if (conPool.size() == 0) {
                newConn = getConnection();
            } else {
                newConn = (Connection) conPool.lastElement();
                conPool.removeElement(newConn);
            }
            activeConnections.addElement(newConn);
            LOGGER.info("The connection was retrieved: " + newConn.toString());
            return newConn;
        }
        public synchronized void putback(Connection c) {
            if (c != null) {
                if (activeConnections.removeElement(c)) {
                    conPool.addElement(c);
                    LOGGER.info("Putting the connection back to Connection pooling: " + c.toString());
                } else {
                    throw new NullPointerException("Connection is not in the Active Connections array");
                }
            }
        }

}
