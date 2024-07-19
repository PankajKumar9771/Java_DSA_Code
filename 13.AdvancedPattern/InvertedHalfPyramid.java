
//Inverted Half Pyramid with numbers.
public class InvertedHalfPyramid {

    public static void Pyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 15;
        Pyramid(n);
    }
}
