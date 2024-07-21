import java.util.*;

public class AverageThree {
    public static float average(int a, int b, int c) {
        return ((a + b + c) / 3.f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Average of three number is " + average(10, 13, 10));
        sc.close();
    }
}
