package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class ThreeIntegerSum {


  public static void main(String[] args)
  { 
          Utility utility=new Utility();
        System.out.println("enter the value of size of array n");
          int n=utility.getInteger();
        int[] a = new int [n];
    
         int i;
         System.out.println("enter the elemnt in array");
         for(i=0;i<a.length;i++)
         {
          
         a[i]=utility.getInteger();
         }
        
         Utility.triplets(a);
    } 

}
