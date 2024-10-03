public class XtoPoweN {

    // public static int power(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }

    // // int xnM1 = power(x, n - 1);
    // // int xn = x * xnM1;
    // // return xn;

    // // or

    // return x * power(x, n - 1);
    // }

    // Optimize Power

    // but he call the optimized power twice that not reduce time complexity
    // public static int optimezedPower(int a, int n) {

    // // Base Case
    // if (n == 0) {
    // return 1;
    // }

    // // When n is even
    // int halfPowerSq = optimezedPower(a, n / 2) * optimezedPower(a, n / 2);

    // // When n is odd
    // if (n % 2 != 0) {
    // halfPowerSq = a * halfPowerSq;
    // }
    // return halfPowerSq;

    // }

    // Here optimized
    public static int optimezedPower(int a, int n) {

        // Base Case
        if (n == 0) {
            return 1;
        }

        // When n is even
        int halfPower = optimezedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // When n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String[] args) {
        // System.out.println(power(2, 10));

        System.out.println(optimezedPower(2, 5));
    }
}
