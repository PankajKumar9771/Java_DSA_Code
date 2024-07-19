import java.util.*;

public class PrimeCheck {

    public static boolean isPrime(int num) {

        // this is the check of prime with help of variable
        // boolean isPrime = true;
        // for (int i = 2; i <= num - 1; i++) {
        // if (num % i == 0) {
        // isPrime = false;

        // }
        // }
        // return isPrime;

        // without need of variable
        // corner Case
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(2));
        sc.close();
    }
}