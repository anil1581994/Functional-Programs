package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

	  public static void main(String[]args)
	  {
	    
       int rows=0,columns = 0;
       int choice;
         Utility utility=new Utility();
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Printing a Integer 2d Array......");
			System.out.println("2.Printing a Double 2d Array......");
			System.out.println("3.Printing a Boolean 2d Array......");
	        choice=utility.getInteger();
	        
	        if(choice>0 && choice<=3) {
	        System.out.println("Enter the rows and columns.........");
	    	rows=utility.getInteger();
	    	 columns=utility.getInteger();
	        }
	        
	        
	    	Integer[][] i1=new Integer[rows][columns];
	    	Double[][] d=new Double[rows][columns];
	    	Boolean[][] b=new Boolean[rows][columns];
		switch(choice) {
	         	
		case 1 :System.out.println("Enter the Integer Array Elements.......");
		        for(int i=0;i<rows;i++)
		        for(int j=0;j<columns;j++)
		        i1[i][j]=utility.getInteger();
		    	utility.print2DArray(i1,rows,columns);
		        break;
		case 2:System.out.println("Enter the Double Array Elements.......");
			   for(int i=0;i<rows;i++)
			   for(int j=0;j<columns;j++)
			   d[i][j]=utility.getDouble();
			   utility.print2DArray(d,rows,columns);
			   break;
		case 3:System.out.println("Enter the Boolean Array Elements.......");
		       for(int i=0;i<rows;i++)
		       for(int j=0;j<columns;j++)
		       b[i][j]=utility.getBoolean();
		       utility.print2DArray(b,rows,columns);
		       break;
		 default:System.exit(0);
		}	
		} while(choice!=0);
		
}
}


