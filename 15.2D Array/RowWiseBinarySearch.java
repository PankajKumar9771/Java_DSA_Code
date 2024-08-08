import java.util.Arrays;

public class RowWiseBinarySearch {

    // Binary search function for one-dimensional array
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }

    // Function to search target in each row of a 2D array
    public static void searchInSortedRows(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            //  System.out.println("Searching in row " + i + ": " + Arrays.toString(matrix[i]));
            int index = binarySearch(matrix[i], target);

            if (index != -1) {
                System.out.println("Element " + target + " found at row " + i + ", column " + index);
                return; // Target found, exit the function
            }
        }

        // Target was not found in any row
        System.out.println("Element " + target + " not found in any row");
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 37;
        searchInSortedRows(arr, target);
    }
}
