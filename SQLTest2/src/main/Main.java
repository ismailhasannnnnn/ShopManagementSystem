package main;

import java.sql.*;
import java.util.Scanner;

public class Main {
	
	public String url = "jdbc:mysql://localhost:3306/database";
	public String user = "Zylox";
	public String pass = "Stripes12";
	public static String name;
	public static String hobby;
	public static String food;
	public static int age;
	static Scanner in = new Scanner(System.in);
	
	public void openConnection() {
		
		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			Statement state = conn.createStatement();
			String queryString = "select * from javatest";
			ResultSet rs = state.executeQuery(queryString);
			state.executeUpdate("INSERT INTO javatest (Name, Age, Food, Hobby) VALUES ('"+name+"', '"+age+"', '"+food+"', '"+hobby+"')");
			System.out.println("Connected, and uploaded data successfully!");
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Failed.");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Main conn = new Main();
		
//		System.out.println("Name?");
//		 name = in.next();
//		System.out.println("Age?");
//		 age = in.nextInt();
//		System.out.println("Food?");
//		 food = in.next();
//		System.out.println("Hobby?");
//		 hobby = in.next();		
		conn.openConnection();
		
	}

}
