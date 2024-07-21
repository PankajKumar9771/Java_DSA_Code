//Exit the loop when number is equal to the multiple of 10
import java.util.*;

public class BreakCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        do {
            System.out.println("Enter the Number.");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println("User type this number "+num);
        } while (true);
        sc.close();
    }
}