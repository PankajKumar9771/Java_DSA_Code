
//Exit the loop when number is equal to the multiple of 10
import java.util.*;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the Number.  Note:For exit the loop enter 0");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 10 == 0) {
                continue;
            }
            

            System.out.println("User type this number " + num);
        } while (true);
        sc.close();
    }
}