package com.first.pattern;

public class Pattern16 {
	 public static void main(String[] args)
	    {
	        int alphabet = 65;
	                for (int i = 0; i<= 25; i++)
	        {
	            for (int j = 0; j <= i; j++)
	            {
	                System.out.print((char) alphabet + " ");
	            }
	            alphabet++;
	            System.out.println();
	        }
	    }
}
