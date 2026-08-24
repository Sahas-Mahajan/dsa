package LogicBuilding;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 547 --> 5 + 4 + 7 = 16

        int n = sc.nextInt();
        int sum = 0, digit = 0;
        while(n != 0){
            digit = n % 10;    //Extract last digit --> 547 % 10 = 7
            n = n / 10;        //Remove last digit from n ---> 547 = 54 | 7
            sum = sum + digit; //Add extracted digit with sum --> 0 + 7 = 7  and repeat till 547 != 0
        }
        System.out.println(sum); //print sum = 16
    }
}
