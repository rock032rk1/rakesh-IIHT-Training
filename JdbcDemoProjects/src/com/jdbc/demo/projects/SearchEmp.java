package com.jdbc.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchEmp {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "select * from employee where emp_id=?";

	public static void main(String[] args) {

		try 
		{

			Connection con = DriverManager.getConnection(url, username, pass);
			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee ID for Search");
			int id = sc.nextInt();

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) 
			{

				System.out.println("Employee ID      : " + rs.getInt("emp_id"));
				System.out.println("Employee Name    : " + rs.getString("e_name"));
				System.out.println("Employee Address : " + rs.getString("address"));
				System.out.println("Employee Gender  : " + rs.getString("gender"));
				System.out.println("Employee Salary  : " + rs.getDouble("salary"));
			}

		} catch (SQLException e) 
		{

			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}
	}
}
