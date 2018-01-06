package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class ThreeIntegerSum {


  public static void main(String[] args)
  { 
          Utility utility=new Utility();
         System.out.println("enter the value of size of array n");
           int n=utility.getInteger();
        int[] a = new int [n];
         for(int i=0;i<=n;i++)
              a[i]=utility.getInteger();
            utility.printAll(a);
           utility.count(a);
    
    } 

}
