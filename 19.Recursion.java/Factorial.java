
public class Factorial {

    public static int Factorials(int n) {
        if (n == 1) {
            return 1;
        }
        int fn = n * Factorials(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(Factorials(5));
    }
}
