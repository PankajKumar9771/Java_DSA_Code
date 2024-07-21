import java.util.*;

public class Palindrome {
    public static void checkPalindrome(int num) {
        int myNum = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == myNum) {
           
            System.out.println("Given number is Palindrone");
        } else {
            System.out.println("Given number is not palindrone");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkPalindrome(181);
        sc.close();
    }
}