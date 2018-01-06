package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Factors {
	public static void main(String[] args) 
    { 
		Utility utility = new Utility();
        System.out.println("enter the number to get prime by brute force");
		int n=utility.getInteger();
        System.out.print("The prime factorization of " + n + " is: ");
      utility.diplayPrimeFactors(n);

     
    }
}
