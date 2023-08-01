package com.first.pattern;

public class Pattern19 {
	public static void main(String args[]) 
	  {
	      int n = 6;  // Number of rows.
	 
	      //Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          for(int k=i;k<n;k++)
	          System.out.print("  ");
	 
	          // We run loop till j = 2*i to print odd no. of stars.
	          for(int j=0;j<=2*i;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("* ");
	          }
	 
	          System.out.println();
	      }

	      int m = 13;
	      //Outer Loop for number of Rows
	      for(int i=0;i<m;i++)
	      {
	          // Inner loop for printing '*' in each column.
	          for(int j=0;j<m;j++)
	          {
	              // For first row and last row we print '*' and for every other row we print the '*' at boundary region. 
	              if(i==1 || i==m-1 || j==0 || j==m-1)
	              {
	              System.out.print("* ");
	              }
	              // Otherwise we print blank space.
	              else
	              System.out.print("  ");
	          }
	          System.out.println();
	      }
	  }
	  }

