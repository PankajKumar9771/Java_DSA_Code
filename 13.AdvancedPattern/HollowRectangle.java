import java.util.*;

public class HollowRectangle {
    public static void hollow_Ractangle(int totRows, int totCols) {
        // outer Loops
        for (int i = 1; i <= totRows; i++) {
            // innner Loops
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || j == 1|| i ==  totRows || j == totCols) {
                    System.err.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hollow_Ractangle(14, 15);
        sc.close();
    }
}