package com.shoping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		// load driver
		Class.forName("com.mysql.jdbc.Driver");
		// establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project", "root", "1234");
		return connection;
	}
}

