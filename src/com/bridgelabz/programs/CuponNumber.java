package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CuponNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the valueof cupon");

		int numberOfCoupon = scanner.nextInt();
		int count = Utility.PrintDistinctCoupon(numberOfCoupon);// call method to collect coins
		System.out.println("Number of count: "+count);
		scanner.close();
	}

}
