package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Hello {

public static void main(String[] args) {

	Utility utility = new Utility();
     System.out.println("enter the user");
	String userName=utility.getString();
	utility.getUserName( userName );
 
}
 
}
