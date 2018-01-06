package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Quadratic {
 public static void main(String[] args) {
	 Utility utility=new Utility();
	 System.out.println("enter the three value");
	    double value1=utility.getDouble();
	    double value2=utility.getDouble();
	    double value3=utility.getDouble();
	        utility.quadratic(value1,value2,value3);
	 
}
}
