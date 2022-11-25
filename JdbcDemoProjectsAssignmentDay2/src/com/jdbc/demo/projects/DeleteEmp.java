package com.jdbc.demo.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmp {

	static final String url="jdbc:mysql://localhost:3306/democog";
	static final String username="root";
	static final String pass="pass@word1";
	static String query="delete from employee where emp_id=?";
	
	public static void main(String[] args) {
		
		int status=0;
		try {
			
			Connection con=DriverManager.getConnection(url, username, pass);
			PreparedStatement ps=con.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the employee ID for Delete");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			status=ps.executeUpdate();
			
			if(status>0) {
				System.out.println("Record with ID "+id+" deleted successfully...");
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL exception occurs");
			e.printStackTrace();
		}
	}

}
