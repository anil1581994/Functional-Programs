package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class WindChill {
public static void main(String[] args) {
	Utility utility=new Utility();
	System.out.println("Enter the temprature");
	double temperature=utility.getDouble();
	System.out.println("Enter the velocity");
	double velocity=utility.getDouble();
	utility.windChill(temperature,velocity);
	
	
	
}
}
