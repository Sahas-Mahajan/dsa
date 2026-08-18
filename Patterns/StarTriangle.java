package Patterns;
import java.util.Scanner;

public class StarTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row, col;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= row; col++){

                /*
                1] *
                   * *
                   * * *
                   * * * *
                 */

//                System.out.print("* ");

                /*
                2] 1
                   1 2
                   1 2 3
                   1 2 3 4
                 */

//                System.out.print(col + " ");

                /*
                3] A
                   A B
                   A B C
                   A B C D
                 */

//                System.out.print((char) (col+64) + " ");

                /*
                4] a
                   a b
                   a b c
                   a b c d
                 */

//                System.out.print((char) (col+96) + " ");

                /*
                5] a
                   a B
                   a B c
                   a B c D
                 */

                if(row % 2 == 0){
                    System.out.print((char) (row + 64) + " ");
                }
                else{
                    System.out.print((char) (row + 96));
                }
            }
            System.out.println();
        }
    }
}
