package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LeapYear {
public static void main(String[] args) {
	Utility utility=new Utility();

	  int digitNum=0;
	   
	   System.out.println("enter year to check leap year or not");
	    int y=utility.getInteger();
	    
	     utility.checkLeapYear(y);
}
}
