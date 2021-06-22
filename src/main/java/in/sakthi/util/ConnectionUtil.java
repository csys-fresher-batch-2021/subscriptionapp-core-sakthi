package in.sakthi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	/**
	 * Database Connection
	 */
	private ConnectionUtil() {
		throw new IllegalStateException("ConnectionUtil");
	}

	private static final String DRIVER_CLASS_NAME = System.getenv("spring.datasource.driver-class-name");
	private static final String DATABASE_NAME = System.getenv("spring.datasource.url");
	private static final String USERNAME = System.getenv("spring.datasource.username");
	private static final String PASSWORD = System.getenv("spring.datasource.password");
	private static final String DB_URL = DATABASE_NAME;

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to get the database connection");
		}
		return connection;
	}

	public static void close(Statement pst, Connection connection) {
		try {
			if (pst != null) {
				pst.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close1(ResultSet rst, Statement pst, Connection connection) throws SQLException {
			if (rst != null) {
				rst.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (connection != null) {
				connection.close();
			}
	}
}
