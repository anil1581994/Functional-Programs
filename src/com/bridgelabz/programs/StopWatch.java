package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) throws Exception
	{
	

		Utility utility=new Utility();
		System.out.println("Press '1' to Start Time: ");
		utility.getInteger();
		utility.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		utility.getInteger();
		
		utility.stop();

		long l=utility.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}
