import java.util.*;

public class FunctionExample {

    public static int Multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = 2;
        System.out.println("Multiply of a and b " + Multiply(a, b));
        sc.close();
    }
}