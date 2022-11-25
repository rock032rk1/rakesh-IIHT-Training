package com.login.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "select * from registration where email=? AND pass=?";

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection(url, username, pass);
			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Email ID");
			String email = sc.nextLine();
			System.out.println("Enter the Password");
			String password = sc.nextLine();

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				
				System.out.println("Login Successfully.....");
			}else {
				
				System.out.println("Invalid Email ID and Password.....");
			}


		} catch (SQLException e) {

			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}

	}
}
