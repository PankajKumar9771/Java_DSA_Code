import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {

                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Given number is prime");
        } else {
            System.out.println("Not prime");
        }

        sc.close();
    }
}
