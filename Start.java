package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to EXIT Student");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				System.out.println("Enter Student name :");
				String name=br.readLine();
				System.out.println("Enter Student Phone :");
				String phone=br.readLine();
				System.out.println("Enter Student city :");
				String city=br.readLine();
				Student st=new Student(name,phone,city);
				boolean status=StudentOperations.addstudent(st);
				if(status==true)
				{
					System.out.println("Record added successfully");
				}
				else
				{
					System.out.println("Failed to add record");
				}
				
			}
			else if(c==2)
			{
				System.out.println("Enter student id to delete :");
				int id=Integer.parseInt(br.readLine());
				boolean status=StudentOperations.deletestudent(id);
				if(status==true)
				{
					System.out.println("Record deleted successfully");
				}
				else
				{
					System.out.println("Failed to delete record");
				}
				
			}
			else if(c==3)
			{
				
			}
			else if(c==4)
			{
				break;
			}
		
		}
		
		System.out.println("Thank You for using the Application");
		
		

	}

}
