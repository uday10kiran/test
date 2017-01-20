package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {

	public static Connection getDBConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://172.16.103.205:3306/simpleAppDB", “uday”, "Training@Jn1t");
				   //DriverManager.getConnection("jdbc:mysql://localhost:3306/simpleAppDB", "root", "Training@Jn1t");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;

	}
}
