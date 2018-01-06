package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Gambler {
public static void main(String[] args) {
	Utility utility=new Utility();
	 System.out.println("..enter the stake(amt),goal,trial..");
     int stake=utility.getInteger();
     int goal=utility.getInteger();
    int trial=utility.getInteger();
      utility.gambler(stake, goal, trial);
	
}
}
