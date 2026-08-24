package LogicBuilding;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Same as reverse number only store num value in other variable and compare is it same as original
        //It can be string or integer (any number)
        //12321  --> reverse = 12321 ==> palindrome(its same from forward and backward)

        int num = sc.nextInt();
        int rem = 0, rev = 0;
        int store = num;        // store = 123
        while(num != 0){
            rem = num % 10;           //to extract last digit  --> 12321 % 10 = 1
            rev = (rev * 10) + rem;   // rev --> 0 * 10 + 1
            num = num / 10;           // num --> 12321 / 10 = 1232 | 1 --> remove last digit and continue till != 0
        }
        System.out.println(rev);      // rev = 12321
        if(store == rev){             // 12321 = 12321 --> palindrome
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
