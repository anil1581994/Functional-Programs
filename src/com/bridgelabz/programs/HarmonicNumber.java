package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
public static void main(String[] args) {
	Utility utility=new Utility();
	System.out.println("enter number upto where you want print harmonic series");
	int number= utility.getInteger();
	utility.harmonicSeries(number);
	
	
}
}
