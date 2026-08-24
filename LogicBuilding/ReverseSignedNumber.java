package LogicBuilding;
import java.util.Scanner;

public class ReverseSignedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Leetcode Problem --> Reverse 32-bit signed Integer
        // x = 123 --> 321
        //some edge cases --> x = -123 => -321  & x = 120 => 21
        //(-2^31, 2^(31-1)) --> Min to Max INTEGER value ==> then it will 0

        int x = sc.nextInt();   //x = 123
        int rem = 0, rev = 0;
        while(x != 0){
            rem = x % 10;    //to extract last digit  --> 123 % 10 = 3
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                System.out.print(0);  //to check Overflow(2^(31-1)) or Underflow(-2^31)
            }
            rev = (rev * 10) + rem;  // rev --> 0 * 10 + 3
            x = x / 10;              // x --> 123 / 10 = 12 | 3 --> remove last digit and continue till != 0
        }
        System.out.print(rev);       // 123 --> 321 or -123 --> -321(with sign value)
    }
}
