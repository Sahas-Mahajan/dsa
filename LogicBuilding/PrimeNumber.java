package LogicBuilding;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //prime --> 2,3,5,7,9,11,13,17,...
        // n = 7 --> divisors are 1 and itself means (1,7) --> prime
        // n = 2 --> even prime number

        int n = sc.nextInt();                   //eg. 5
        if(n <= 1){
            System.out.println("Not prime");
            return;                             //if input is 1 then return not prime
        }

        boolean isPrime = true;                 // set isPrime by default

        for(int i = 2; i * i <= n; i++){        // loop from 2 to it's perfect square <= n
            if(n % i == 0){                     // 5 % 2 == 0, 5 % 3 == 0, ... if 0 then not prime and break the loop
                isPrime = false;
                break;
            }
        }
        if(isPrime){                           //isPrime is true --> so prime
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
