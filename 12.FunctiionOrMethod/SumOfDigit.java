// Write a Java method to compute the sum of the digits in an integer

import java.util.*;

public class SumOfDigit {
    public static void sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
          
        }
        System.out.println("The sum of all Digit " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumDigit(7872);
        sc.close();
    }
}