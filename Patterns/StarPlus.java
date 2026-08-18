package Patterns;

/*
FOR Hollow Rectangle
        *
        *
    * * * * *
        *
        *
    'n' should be always taken odd number
 */

import java.util.*;
public class StarPlus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;
        int mid = (n + 1) / 2;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= n; col++){
                if(row == mid || col == mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
