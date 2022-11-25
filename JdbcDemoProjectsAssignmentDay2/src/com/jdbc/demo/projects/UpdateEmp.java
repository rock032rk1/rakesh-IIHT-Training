package com.jdbc.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmp {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "update employee set e_name=? where emp_id=?";

	public static void main(String[] args) {

		int status = 0;
		try 
		{

			Connection con = DriverManager.getConnection(url, username, pass);
			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee ID for Update");
			int id = sc.nextInt();
			System.out.println("Enter the employee Name for Update");
			String name = sc.next();

			ps.setString(1, name);
			ps.setInt(2, id);

			status = ps.executeUpdate();

			if (status > 0) 
			{
				System.out.println("Employee with ID " + id + " Update Successfully....");
			}

		} catch (SQLException e) 
		{

			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}
	}
}
