package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connection {
	 private static final String URL = "jdbc:mysql://localhost:3306/db_megacity";
	    private static final String USER = "root";
	    private static final String PASSWORD = "Mysql1234";

	    static {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    } 

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }
}
