package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Permutation {
	
	    public static void main(String[] args)
	    { 
	    	Utility utility=new Utility();
	    	System.out.println("Enter a string to check possible permutation by recursion ");
	        String str =utility.getString();
	        int n = str.length();
	         Utility.recursivePermutation(str, 0, n-1);
	         System.out.println("Enter a string to check possible permutation by iteration ");
	         Utility.iterativPermute(str,0,n-1);
	        
	    }
	 
	 
	}

