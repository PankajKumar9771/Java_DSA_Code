//In this program we make a hollow rectangle and then add in to the space with inverted triangel first.
public class HollowRhombus {
    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // make hollow Rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(9);
    }

}