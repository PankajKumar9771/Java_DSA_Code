
public class PrintSumNatural {

    public static int naturalSum(int n) {
        if (n == 1) {
            return 1;
        }

        int sum = n + naturalSum(n - 1);
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(naturalSum(5));
    }
}
