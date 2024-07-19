import java.util.*;

public class BinaryToDecimal {

    public static void decimalNum(int binaryNum) {
        int myNum = binaryNum;
        int dec = 0;
        int pow = 0;
        while (binaryNum > 0) {
            int lastDigit = binaryNum % 10;
            dec = dec + lastDigit * (int) (Math.pow(2, pow));
            pow++;
            binaryNum = binaryNum / 10;

        }
        System.out.println("Decimal number is this " + myNum + " is " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
decimalNum(1000);
        sc.close();
    }
}