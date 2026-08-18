package Patterns;

/*
            *
          * *
        * * *
      * * * *
 */

import java.util.*;
public class StarTriangleVerticallyFlipped {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;

//        for(row = 1; row <= n; row++){
//            for(col = 1; col <= n; col++){
//                if(row + col > n){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //Other Logic or method to solve above question --> is using 2 loops inside one outer loop

        for(row = 1; row <= n; row++){
            for(col = 1; col <= n - row; col++){ //spaces
                System.out.print("  ");
            }
            for(col = 1; col <= row; col++){ //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}