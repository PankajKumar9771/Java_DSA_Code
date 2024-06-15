import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the character ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Sum of a and b " + (a + b));
                break;
            case '-':
                System.out.println("Sub of a and b " + (a - b));
                break;
            case '*':
                System.out.println("Sub of a and b " + (a * b));
                break;
            case '/':
                System.out.println("Sub of a and b " + (a / b));
                break;
            default:
                break;
        }
        sc.close();
    }
}
