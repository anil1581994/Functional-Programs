package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("enter the first value");
		double x=utility.getDouble();
		System.out.println("enter the second value");
		double y=utility.getDouble();
		/*double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);*/
        utility.printDistance(x,y);
       
	}

}
