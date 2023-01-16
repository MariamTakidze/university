package com.solvd.utils;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBUtil {
    private static final String DB_DRIVER_CLASS="driver.class.name";
    private static final String DB_USERNAME="db.username";
    private static final String DB_PASSWORD="db.password";
    private static final String DB_URL ="db.url";

    private static Connection connection = null;
    private static Properties properties = null;
    static{
        try {
            properties = new Properties();
            FileInputStream f=new FileInputStream("C:\\Users\\MTakidze\\IdeaProjects\\UniversityGang\\src\\main\\resources\\mySQLcreds.properties");
            properties.load(f);
            Class.forName(properties.getProperty(DB_DRIVER_CLASS));
            connection = DriverManager.getConnection(properties.getProperty(DB_URL),properties.getProperty(DB_USERNAME) , properties.getProperty(DB_PASSWORD) );
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        return connection;
    }
}
