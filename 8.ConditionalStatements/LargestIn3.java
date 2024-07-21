import java.util.*;

public class LargestIn3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 50;
        int b = 130;
        int c = 1220;

        // if (a > b && a>c) {

        // System.out.println("A is largest number");
        // }

        // else if (b > a && b>c) {

        // System.out.println(" B id greater ");

        // }
        // else {
        // System.out.println("c is larger ");
        // }
        if (a > b && a > c) {
            System.err.println("A is greater than all");
        } else if (b > c) {
            System.out.println("b is greater than all");
        } else {
            System.out.println("c is greater");
        }
        sc.close();
    }
}
