package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
/// The six steps to interact the database postgres SQL using Java database connectivity
	public static void main(String[] args) {
		
		Connection connection = null;
		try {
			//Step 1 -- Load Driver
			Class.forName("org.postgresql.Driver"); //Maven driver for postgres?
			System.out.println("Driver Loaded Successfully");
			
			//Step 2 -- Open Connection
			String url="jdbc:postgresql://localhost:5432/postgres"; //your url to your database
			String username="postgres"; // your username to connect to database
			String password="prosqlpost"; // your password to connect to database
			connection = DriverManager.getConnection(url,username,password); // The line that puts all your data together to connect to the database
			System.out.println("Connection Opened");
			
			
			//Step 3 - Create Statement //This is where you write SQL queries - Out of the 3 statements: this is a 1) statement
			Statement statement = connection.createStatement(); //create statement object to use to invoke connection methods or constructors?
			//String sql = "select id, name, age, city, gender from player_schema.player";
			String sql = "select p.id, p.name, p.city, p.age, p.gender, t.teamname, t.location " //
					+ "from player_schema.player p   join player_schema.team t "
					+ "on p.teamid =t.teamid order by age desc";
			
			//Step 4 - Execute Query // now you have to EXECUTE THE QUERY, out of the types we are using Resultset execute here
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step 5 - Process Results
			System.out.println("Printing all Players");
			while(resultSet.next()) {//if there a next record it will move the point to the next line
				System.out.print("Player id is : " +resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.print(" Teamname : "+resultSet.getString("teamname"));
				System.out.println(" Location : "+resultSet.getString("location"));
			}
			System.out.println("Results Processed Successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step 6 - release connection
				connection.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
