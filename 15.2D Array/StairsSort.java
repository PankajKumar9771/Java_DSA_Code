public class StairsSort {

    // public static boolean stairsCaseSort(int matrix[][], int key) {
    // int row = 0, col = matrix[0].length - 1;
    // while (row < matrix.length - 1 && col >= 0) {
    // if (key == matrix[row][col]) {
    // System.out.println("Found at the key (" + row+"," + col + ")");
    // return true;
    // } else if (key < matrix[row][col]) {
    // col--;
    // } else {
    // row++;
    // }
    // }
    // System.out.println("Key is not Found");
    // return false;

    // }

    public static boolean stairsCaseSort(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println("Found at the key (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }

        System.out.println("Key not Found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        stairsCaseSort(arr, 50);
    }
}
