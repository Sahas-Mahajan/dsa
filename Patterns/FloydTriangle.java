package Patterns;

/*
    1
    2 3
    4 5 6
    7 8 9 10
 */

import java.util.*;
public class FloydTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col;
        int a = 1;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= row; col++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

/*
    1
    1 3
    1 3 5
    1 3 5 7
 */

//Logic ---> System.out.print(2 * col - 1 + " "); ---> 2 x 1 - 1 = 1, 2 x 2 - 1 = 3, ....