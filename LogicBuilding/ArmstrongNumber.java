package LogicBuilding;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // num = 371 --> 3^3 + 7^3 + 1^3 = 27 + 343 + 1 => 371 (Same as original number) so its armstrong number
        // Power should be count of number eg. 371 are 3 counts digits so power = 3

        int num = sc.nextInt();                        //num = 371
        int original = num, count = 0;                 //original = 371
        double sum = 0.0;

        int temp = num;                                //temp = 371
        while(temp > 0){
            temp = temp / 10;                          // temp = 371 / 10 = 37 | 1
            count++;                                   // count = 1  then 2 then 3 till temp > 0 i.e 371 > 0 here
        }
        temp = num;                                    // temp = num --> reset temp to original number
        while(temp > 0){
            int digit = temp % 10;                     // digit = 371 % 10 = 1
            sum = sum + (Math.pow(digit, count));      // sum = 0.0 + 1^3
            temp = temp / 10;                          // temp = 371 / 10  = 37
        }
        System.out.println(num + (sum == original ? " is Armstrong" : " is Not Armstrong"));  //371.0 == 371
    }
}
