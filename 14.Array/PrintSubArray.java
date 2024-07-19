import java.util.*;

public class PrintSubArray {
    public static void print(int numbers[]) {
        int ts = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + numbers[k];
                    System.out.print(+numbers[k] + " ");
                }
                ts++;

                System.out.println("=> Sum is " + sum);
                //Maximum sum 
                if (largest < sum) {
                    largest = sum;
                }
                //Minimum sum 
                if (smallest > sum) {
                    smallest = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total subarrays of arrays " + ts);
        System.out.println("Largest sum of all is " + largest);
        System.out.println("smallest sum of all is " + smallest);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        print(numbers);
    }
}
