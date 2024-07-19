import java.util.*;

public class DecimalToBinary {

    public static void binaryNum(int num) {
        int binary = 0;
        int pow = 0;
        int myNum = num;
        while (num != 0) {
            int rem = num % 2;
            binary = binary + rem * (int) (Math.pow(10, pow));
            num = num / 2;
            pow++;
        }
        System.out.println("Binary number of " + myNum + " is " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binaryNum(8);
        sc.close();
    }
}