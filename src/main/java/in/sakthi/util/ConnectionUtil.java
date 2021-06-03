package in.sakthi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	

	static String driverClass = "org.postgresql.Driver";
	static String url = "jdbc:postgresql://localhost:5432/subscription_db";
	static String username = "postgres";
	static String password = "Sakthi14";

	public static Connection getConnection()
	{
	Connection connection = null;	
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to get the database connection");
		}
		return connection;
	}

	
		
	}


