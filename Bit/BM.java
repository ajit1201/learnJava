package Bit;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class BM {
    /*
     * public static int revNum (int n)
     * {
     * int rev = 0;
     * while (n > 0)
     * {
     * rev *= 10;
     * rev += n % 10;
     * rev /= 10;
     * n /= 10;
     * }
     * return rev;
     * }
     * public static int decToBin (int n)
     * {
     * int decimal = 0;
     * int quo = n;
     * int rem = 0;
     * while (quo > 0)
     * {
     * decimal *= 10;
     * rem = quo % 2;
     * quo = quo / 2;
     * decimal += rem;
     * }
     * 
     * return rem;
     * }
     */
    public static int binToDec(int n) {
        int p = 0;
        int num = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            n /= 10;
            num += rem * Math.pow(2, p++);
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(binToDec(101));
    }
}
