import java.util.*;

public class Factorial {

    public static int getFactorial(int num) {
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial.");
        int num = sc.nextInt();
        System.out.println("Factorial of the given number. " + getFactorial(num));
        sc.close();
    }
}