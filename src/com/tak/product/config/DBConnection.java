package com.tak.product.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCprojectImp?createDatabaseIfNotExist=true", "root", "9359792403");

			System.out.println("connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}
