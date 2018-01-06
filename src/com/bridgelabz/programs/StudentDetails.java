package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StudentDetails {

	public static void main(String[] args) {
		Utility utilObj = new Utility();
		try {

			utilObj.displayDetails("Enter Student Name");
			String name = utilObj.getString();
			utilObj.displayDetails("Enter Student Age");
			int age = utilObj.getInteger();
	
			utilObj.displayDetails("Student Name is::"+name);
			utilObj.displayDetails("Student Age is"+age );
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
