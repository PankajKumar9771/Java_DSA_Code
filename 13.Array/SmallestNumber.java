// import java.util.*;

public class SmallestNumber {

    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 44, 5, 44, 33, 5, 55,0 };
        System.out.println("smallest number is " + smallest(numbers));
    }
}
