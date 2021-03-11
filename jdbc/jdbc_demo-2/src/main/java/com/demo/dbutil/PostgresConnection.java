package com.demo.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// We are making a method that we can call to to implement step 1, step 2, and step 6 of interacting with DB with JDBC
public class PostgresConnection {

	private static Connection connection;

	private PostgresConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (connection == null) {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "prosqlpost";
			connection = DriverManager.getConnection(url, username, password);
			return connection;
		} else {
			return connection;
		}
	}
}
//Creational Design Pattern - "SingleTon" Java CLass
//1)keep a static variable
//2)Disable constructor access by making it as private
//3)keep a static method which returns the instance of static variable/object check it if the instance is 
//   already created and return it accordingly.