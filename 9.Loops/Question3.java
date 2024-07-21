
// Write a program to print the multiplication table of a number N, entered by the
// user.import java.util.Scanner;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int num = sc.nextInt();
        System.out.println("Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();
    }
}
