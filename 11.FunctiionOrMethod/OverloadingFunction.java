import java.util.*;

public class OverloadingFunction {

    // using parameters
    // public static int sum(int a, int b) {
    // return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // using datatypes
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(12, 34));
        System.out.println(sum(12.3f, 2.8f));
        sc.close();
    }
}