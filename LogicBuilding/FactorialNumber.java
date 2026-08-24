package LogicBuilding;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 5 --> 5! = 1x2x3x4x5 => 120

        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;    // fact * i --> 1 * 1, then 1 * 2, then 1 * 3, ...
        }
        System.out.print(fact);
    }
}
