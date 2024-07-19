import java.util.*;

public class OptimizedPrime {

    public static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(12));
        sc.close();
    }
}