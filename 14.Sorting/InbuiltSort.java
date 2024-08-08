
// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class InbuiltSort {

    // public static void print(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
    public static void print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 4, 3, 1, 2 };
        Integer arr[] = { 5, 4, 3, 1, 2 };

        {// For Ascending Order.
         // Arrays.sort(arr); // Its sort the array in ascending order.

            // Arrays.sort(arr, 0, 3);//Its is used to sort on specific index
            // print(arr);
        }

        {// For Descending Order.
            // Arrays.sort(arr, Collections.reverseOrder());
Arrays.sort(arr,0,3,Collections.reverseOrder());
            print(arr);
        }
    }
}
