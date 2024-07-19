import java.util.*;

public class FunctionWithPara {

    // Function with parameters
    public static int sumCalculation(int num1, int num2) {
        return (num1 + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the two number.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumCalculation(a, b);
        System.err.println("Sum is " + sum);

        sc.close();
    }
}