package Patterns;
import java.util.Scanner;

public class SquareNumberAlphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row, col;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= n; col++){

                /* 1] 1 1 1 1
                      2 2 2 2
                      3 3 3 3
                */
//                System.out.print(row + " ");

                /*
                2] A A A A
                   B B B B
                   C C C C
                 */
//                System.out.print((char)(row+64) + " ");

                /*
                3] a a a a
                   B B B B
                   c c c c
                   D D D D
                 */

                if(row % 2 == 0){
                    System.out.print((char)(row+64) + " ");
                }
                else{
                    System.out.print((char)(row+96) + " ");
                }
            }
            System.out.println();
        }
    }
}
