package LogicBuilding;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n = 6  --> 0 1 1 2 3 5  => 1st + 2nd number equals 3rd number means 0+1 = 1, 1+1 = 2, 1+2 = 3,...

        int n = sc.nextInt();
        int firstNum = 0, secNum = 1;
        System.out.print(firstNum + " ");  //Print firstNum --> 0
        System.out.print(secNum);          //Print secNum --> 1  => 0 1
        for(int i = 2; i < n; i++){        //Starts from 2nd index --> 0 1 1 => here
            int sum = firstNum + secNum;   // sum = 0 + 1
            System.out.print(" " + sum);   // sum = 1
            firstNum = secNum;             // firstNum = 1
            secNum = sum;                  // secNum = 1  and repeat till n = 6
        }
    }
}
