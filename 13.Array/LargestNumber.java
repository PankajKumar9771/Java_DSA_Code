// import java.util.*;

public class LargestNumber {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 44, 5, 44, 33, 5, 55 };
        System.out.println("Largest number is " + largest(numbers));
    }
}
