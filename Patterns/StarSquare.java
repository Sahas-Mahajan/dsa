package Patterns;

/*
FOR STAR SQUARE
* * *
* * *
* * *
 */
import java.util.*;
public class StarSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;
        for(row = 1; row <= n; row++){ //kitne no. of lines hai
            for(col = 1; col <= n; col++){ // har line me kitne baar print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
