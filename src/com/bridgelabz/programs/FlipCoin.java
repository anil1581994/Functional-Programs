package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		Utility utlity=new Utility();
		System.out.println("enter how many time you want flip coin");
		int numberTimeFlip=utlity.getInteger();
		utlity.flipCoin(numberTimeFlip);
	}

	 
}
