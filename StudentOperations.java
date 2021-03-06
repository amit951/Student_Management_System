package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentOperations 
{

	public static Boolean addstudent(Student st) {
		
		boolean flag=false;
	try {
		Connection con=CP.createC();
		String q="insert into student(sname, sphone, scity) values (?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setString(1, st.getSname());
		pstmt.setString(2, st.getSphone());
		pstmt.setString(3, st.getCity());
		
		pstmt.executeUpdate();
		
		flag=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return flag;
}
	
	
	
	public static Boolean deletestudent(int id) {
		
		boolean flag=false;
	try {
		Connection con=CP.createC();
		String q="delete from student where sid=?";
		PreparedStatement pstmt= con.prepareStatement(q);
		pstmt.setInt(1,id);
		
		pstmt.executeUpdate();
		
		flag=true;
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return flag;
}
	
	
}