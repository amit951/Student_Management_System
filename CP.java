package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	
	public static Connection createC()
	{
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			String url="jdbc:mysql://localhost:3306/student_management";
			String user="root";
			String password="root";
			
			
			con=DriverManager.getConnection(url,user,password);
			
			
			
		}
		catch (Exception e) {
		e.printStackTrace();	// TODO: handle exception
		} 
		
		return con;
	}
	
	
}
