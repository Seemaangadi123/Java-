package com.first.pattern;

public class Pattern10 {
	  public static void main(String[] args) {
          int i, j, k = 1;
          for (i = 1; i <= 10; i++) {
              for (j = 1; j< i + 1; j++) {
                  System.out.print(k++ + " ");
              }
     
              System.out.println();
          }
      }

}
