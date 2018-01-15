package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrintUser {

public static void main(String[] args) {

 
      Utility utility=new Utility();
	
	   String name="<<UserName>>";
		System.out.println("Enter the UserName........");
		String UserName=utility.getString();
		name=Utility.replaceUser(UserName);
		System.out.println("Hello "+name+" How are you ?");

  
}
 
}
