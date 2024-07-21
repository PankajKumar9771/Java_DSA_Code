import java.util.*;

// Question 4 : READ & CODE EXERCISE
// Search about(Google) & use the following methods of the Math class in Java:
// a. Math.min( )
// b. Math.max( )
// c. Math.sqrt( )
// d. Math.pow( )
// e. Math.avg( )
// f. Math.abs( )

public class MathFunctionMethod {
    // Find minMum Using Math Function
    public static int minimum(int a, int b, int c) {
        // return Math.min(a, b, c); //its give error because its take only two
        // arguments
        return Math.min(Math.min(a, b), c);
    }

    public static int maximum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Find square root using Math Function
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Find power using Math Function
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Find absolute value using Math Function
    public static int absolute(int num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Minimum number is " + minimum(12, 34, 59));

        // Find maximum
        System.out.println("Maximum number is " + maximum(12, 34, 59));

        // Find square root
        System.out.println("Square root of 25 is " + squareRoot(25));

        // Find power
        System.out.println("3 raised to the power of 4 is " + power(3, 4));

        // Find absolute value
        System.out.println("Absolute value of -10 is " + absolute(-10));

        sc.close();
    }
}