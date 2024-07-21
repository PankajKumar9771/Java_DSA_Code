import java.util.*;

public class isEvenMethod {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Question 2 : Write a method named isEven that accepts an int argument. The
        // method
        // should return true if the argument is even, or false otherwise. Also write a
        // program to test your
        // method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number to check the odd or even");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Given number is even.");
        } else {
            System.out.println("Given number is odd.");
        }
        System.out.println(isEven(num));
        sc.close();
    }
}