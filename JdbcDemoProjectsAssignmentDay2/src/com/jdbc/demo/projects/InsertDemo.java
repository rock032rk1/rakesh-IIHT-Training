package com.jdbc.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {

	static final String url = "jdbc:mysql://localhost:3306/democog";
	static final String username = "root";
	static final String pass = "pass@word1";
	static String query = "insert into employee (emp_id,e_name,address,gender,salary) values(?,?,?,?,?);";

	public static void main(String[] args) {

		try 
		{

			Connection con = DriverManager.getConnection(url, username, pass);
			PreparedStatement ps = con.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee ID");
			int id = sc.nextInt();
			System.out.println("Enter the employee Name");
			String name = sc.next();
			System.out.println("Enter the employee Address");
			String address = sc.next();
			System.out.println("Enter the employee Gender");
			String gender = sc.next();
			System.out.println("Enter the employee Salary");
			double salary = sc.nextDouble();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setString(4, gender);
			ps.setDouble(5, salary);

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
