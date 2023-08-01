package com.first.pattern;

public class Pattern8 {

	  public static void main(String args[]) 
	  {
	      int n = 11;  // Number of rows.
	      
	      n = n/2 + 1;
	      
	      int i=0;
	      
	      //We first print Upper Part using Right Angled Logic.
	      for(i=0;i<n;i++)
	      {
	          // We avoid space for last row with 1 star
	          for(int k=i;k<n-1;k++)
	          System.out.print("  ");
	          
	          // No. of '*' for each row changes with i.
	          for(int j=i;j<n;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("< ");
	          }
	          
	          System.out.println();
	      }
	      
	      n=i;  // i=n so copy its value to n.
	      
	      // We then print Lower Part of Pattern.
	      // The lower part always start with 2 stars in first row so we set m=2.
	      int m=2;
	      for(i=n;i>1;i--)
	      {
	          // We need to print one space for first row.
	          for(int k=i;k<n+1;k++)
	          System.out.print("  ");
	          
	          // We increment m after this loop to continue printing stars equal to row number.
	          for(int j=0;j<m;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("> ");
	          }
	          m++;
	          System.out.println();
	      }
	        
	  }
}
