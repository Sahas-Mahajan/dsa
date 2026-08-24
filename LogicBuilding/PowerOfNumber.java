package LogicBuilding;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // base = 2, exponent = 5 --> 2^5(2 to the power 5) = 32

        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= exponent; i++){
            result = result * base;          // 1 * 2 = 2, then 2 * 2 = 4, then 4 * 2 = 8, ...till exponent times
        }
        System.out.println(result);
    }
}
