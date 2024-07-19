public class PalindromicNumber {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            //for space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //for Number 1st part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // For Number 2nd part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
