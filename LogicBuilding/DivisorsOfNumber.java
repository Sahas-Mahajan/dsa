package LogicBuilding;
import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 36 --> 1,2,3,4,6,9,12,18,36 (all are divisors of 36)

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
