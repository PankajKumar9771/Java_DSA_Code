import java.util.*;

public class While {

    // print 1 to 10

    // public static void main(String[] args) {
    // int num = 1;
    // while (num <= 10) {
    // System.out.println(num);
    // num++;
    // }
    // }

    // print 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n that you want to print.");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n) {
            System.err.println(num);
            num++;

        }
        sc.close();
    }

}
