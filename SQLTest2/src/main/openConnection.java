package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class openConnection {
	
	String url;
	String user;
	String pass;
	
	public openConnection() {
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement state = conn.createStatement();
			String queryString = "select * from javatest";
			ResultSet rs = state.executeQuery(queryString);
			System.out.println("Connected, and uploaded data successfully!");
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Failed.");
			e.printStackTrace();
		}
		
	}

}
