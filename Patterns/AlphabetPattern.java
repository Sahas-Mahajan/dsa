package Patterns;
import java.util.Scanner;


/*
      IF USED BOTH
      A a B b C c
      A a B b C c
      A a B b C c
*/

public class AlphabetPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row, col;
        for(row = 1; row <= n; row++){
            for(col = 1; col <= n; col++){

                /*
                 FOR CAPITAL ALPHABETS
                 A B C D
                 A B C D
                 A B C D
                 A B C D
                 */
                System.out.print((char)(col+64) + " "); //typecast int to char.  For capital alphabets

                /*
                FOR SMALL ALPHABETS
                a b c d
                a b c d
                a b c d
                a b c d
                 */
                System.out.print((char)(col+96) + " "); // For small alphabets
            }
            System.out.println();
        }
    }
}
