import java.util.*;

public class SumOfFirstNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.println("Enter the number n For sum 1 to n.");
        int n = sc.nextInt();
        int sum = 0;
        while (num <= n) {
            sum = sum + num;
            num++;
        }
        System.out.println("Total sum of 1 to n " + sum);
        sc.close();
    }

}