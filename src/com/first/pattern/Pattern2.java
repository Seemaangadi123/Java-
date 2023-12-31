package com.first.pattern;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[]) 
	  {
	    int n = 8;  // Number of rows.
	      
	    int m = 2*n-1; // So we need to print total 15 rows.
	    
	    // Outer loop for number of rows.
	    for(int i=1;i<=m;i++)  
	    {  
	      for(int j=1;j<=m;j++)  
	      {  
	       // for each row we print * for the first and last column.      
	       if(i==j || j==(m-i+1))  
	       {  
	         System.out.print("*");  
	       }  
	       // otherwise we print blank space.
	       else  
	       System.out.print(" ");  
	    }  
	    
	    System.out.println();  
	    }  
	        
	  }
}
