package com.jdbc.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "select * from employee";

	public static void main(String[] args) {

		try 
		{

			Connection con = DriverManager.getConnection(url, username, pass);
			Statement smtp = con.createStatement();
			ResultSet rs = smtp.executeQuery(query);
			int count = 1;

			while (rs.next()) 
			{

				System.out.println("Employee ID      : " + rs.getInt("emp_id"));
				System.out.println("Employee Name    : " + rs.getString("e_name"));
				System.out.println("Employee Address : " + rs.getString("address"));
				System.out.println("Employee Gender  : " + rs.getString("gender"));
				System.out.println("Employee Salary  : " + rs.getDouble("salary"));
				System.out.println("================ Row " + count + " ==============");
				count++;
			}

		} catch (SQLException e) 
		{

			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}
	}
}
