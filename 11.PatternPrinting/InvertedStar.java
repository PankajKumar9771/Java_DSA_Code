import java.util.*;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i = 1; i <=4; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Another way
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}