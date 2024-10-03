public class FibnacciSeries {

    public static int Fibnacci(int n) {
        // if (n == 0) {
        // return 0;
        // }
        // if (n == 1) {
        // return 1;
        // }

        if (n == 1 || n == 0) {
            return n;
        }

        // int fibNm1 = Fibnacci(n - 1);
        // int fibNm2 = Fibnacci(n - 2);
        // int fibN = fibNm1 + fibNm2;
        int fibN = Fibnacci(n) + Fibnacci(n + 1);
        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(Fibnacci(24));

        // using for loop Fibnacci
        // int a = 0, b = 1;
        // System.out.print("0" + " " + "1" + " ");
        // for (int i = 2; i < 5!; i++) {
        // int c = a + b;
        // System.out.print(c + " ");
        // a = b;
        // b = c;
        // }

        // int a = 0, b = 1;
        // int fifthNumber = 0;

        // for (int i = 2; i <= 5; i++) {
        //     int c = a + b;
        //     a = b;
        //     b = c;
        //     if (i == 5) {
        //         fifthNumber = c;
        //     }
        // }

        // System.out.println("The 5th number in the Fibonacci sequence is: " + fifthNumber);

    }
}
