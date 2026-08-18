package Patterns;

/*
FOR STAR RECTANGLE
* * * *
* * * *
* * * *
 */

import java.util.*;
public class StarRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 2 inputs row * col matrix
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++){ //kitne no. of lines hai
            for(int j = 1; j <= col; j++){ // har line me kitne baar print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}