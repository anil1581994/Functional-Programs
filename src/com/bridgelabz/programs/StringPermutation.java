package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StringPermutation {
	
	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter string to check its permutation");
		String str=utility.getString();
		
		int n=str.length();
		utility.permute(str, 0, n-1);
	}

 
	
}
