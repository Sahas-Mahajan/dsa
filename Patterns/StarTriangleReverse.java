package Patterns;
import java.util.Scanner;

public class StarTriangleReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row, col;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= n+1-row; col++){ //or for(col = n; col >= row; col--) --> but not best approach for pattern 2

                /*
                1] * * * *
                   * * *
                   * *
                   *
                 */

//                System.out.print("* ");

                /*
                2] 1 2 3 4 5
                   1 2 3 4
                   1 2 3
                   1 2
                   1
                 */

                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
