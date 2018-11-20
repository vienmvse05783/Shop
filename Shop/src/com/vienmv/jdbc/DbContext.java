package com.vienmv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbContext {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String user = "maivien";
			String pass = "maivien1111";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=UPANH";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("thanh cong");
			
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("that bai");
		}

		return connection;
	}
}
