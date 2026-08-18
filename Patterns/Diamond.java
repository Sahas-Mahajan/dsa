package Patterns;

/*
         *
       * * *
     * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/

import java.util.*;
public class Diamond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;

        int space = n - 1;
        int star = 1;

        for(row = 1; row <= n; row++) {
            for (col = 1; col <= space; col++) { //spaces
                System.out.print("  ");
            }
            for (col = 1; col <= star; col++) { //stars
                System.out.print("* ");
            }
            space--;
            star+=2;
            System.out.println();
        }

        space = 1;
        star = 2 * n - 3;
        for(row = 1; row <= n - 1; row++) {
            for (col = 1; col <= space; col++) { //spaces
                System.out.print("  ");
            }
            for (col = 1; col <= star; col++) { //stars
                System.out.print("* ");
            }
            space++;
            star-=2;
            System.out.println();
        }
    }
}