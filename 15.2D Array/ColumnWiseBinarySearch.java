public class ColumnWiseBinarySearch {

    // Binary search function for a column in a 2D array
    public static int binarySearchInColumn(int[][] matrix, int column, int target) {
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            // Check if target is present at mid
            if (matrix[mid][column] == target) {
                return mid;
            }

            // If target greater, ignore top half
            if (matrix[mid][column] < target) {
                top = mid + 1;
            }
            // If target is smaller, ignore bottom half
            else {
                bottom = mid - 1;
            }
        }

        // Target was not found
        return -1;
    }

    // Function to search target in each column of a 2D array
    public static void searchInSortedColumns(int[][] matrix, int target) {
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.print("Searching in column " + col + ": ");
            // for (int row = 0; row < matrix.length; row++) {
            //     System.out.print(matrix[row][col] + " ");
            // }
            System.out.println();
            int index = binarySearchInColumn(matrix, col, target);
            if (index != -1) {
                System.out.println("Element " + target + " found at row " + index + ", column " + col);
                return; // Target found, exit the function
            }
        }

        // Target was not found in any column
        System.out.println("Element " + target + " not found in any column");
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 37;
        searchInSortedColumns(arr, target);
    }
}
