package Patterns;

/*
          * * * *
        * * * *
      * * * *
    * * * *
 */

import java.util.*;
public class Rhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;

        for(row = 1; row <= n; row++) {
            for (col = 1; col <= n - row; col++) { //spaces
                System.out.print("  ");
            }
            for (col = 1; col <= n; col++) { //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}