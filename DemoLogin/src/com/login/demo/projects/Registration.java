package com.login.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "insert into registration (fname,email,pass) values(?,?,?);";

	public static void main(String[] args) {
		
		try 
		{

			Connection con = DriverManager.getConnection(url, username, pass);
			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the First Name");
			String name = sc.nextLine();
			System.out.println(name);
			System.out.println("Enter the Email ID");
			String email = sc.nextLine();
			System.out.println("Enter the Password");
			String password = sc.nextLine();
			

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			
			int val = 0;

			val = ps.executeUpdate();
			
			if (val > 0) 
			{
				System.out.println("Data inserted successfully.....");
			}

		} catch (SQLException e) 
		{

			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}

	}
}
