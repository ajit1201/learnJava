import java.util.*;

public class Bit {

    public static void deciToBin(int n)
    {
        int decimal = 0;
        int quotient = n;
        int rem = 0;

        //while the number copletely divisible by number
        while(n > 0)
        {
            decimal *= 10;
            rem = quotient % 2;
            quotient = quotient/2;
            decimal += rem;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        deciToBin(10);
    }
}
