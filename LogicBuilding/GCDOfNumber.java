package LogicBuilding;
import java.util.Scanner;

public class GCDOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //num1 = 9, num2 = 12
        //factors of 9 = 1,3,9
        //factors of 12 = 1,2,3,4,6,12
        //common = 1,3 ==> 3 is the Greatest common factor

        int num1 = sc.nextInt();     //num1 = 9
        int num2 = sc.nextInt();     //num2 = 12
        while (num2 != 0){           //12 != 0
            int temp = num2;         //temp = 12
            num2 = num1 % num2;      //num2 = 9 % 12 = 3
            num1 = temp;             //num1 = 12 --> then repeat all till num2 != 0 means here 3 % 3 == 0
        }
        System.out.println(num1);    //num1 = 3 --> GCD
    }
}
