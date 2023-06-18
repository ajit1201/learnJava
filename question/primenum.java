package question;
import static java.lang.Math.*;
import java.util.*;

public class primenum {
    public static void main(String[] args) {
        System.out.println(isPrime(15));

        //find number of prime upto range n
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        primeNum(range);

        
    }
    public static void primeNum(int range)
    {
        System.out.print("Prime numbers are: 1 ");
        for(int i = 2; i <= range; i++)
        {
            if(isPrime(i))System.out.print(i + " ");
        }
    }
    public static boolean isPrime(int num)
    {
        if(num == 2)return true;
        for(int i = 2; i <= sqrt(num); i++)if(num % i == 0)return false;
        return true;
    }

}
