package LogicBuilding;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 6 --> 1+2+3(These are divisors of 6) = 6 means addition of divisors of number equals number is perfect no.

        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0) {              //6 % 1 == 0 --> 1 is divisor of 6, then 6 % 2 == 0 --> 2 is divisor, ...
                sum = sum + i;              //if divisor then add it with sum ==> 0 + 1
            }
        }
        System.out.print(num == sum);      //match num == sum --> 6 == 6 and if match then true
    }
}
