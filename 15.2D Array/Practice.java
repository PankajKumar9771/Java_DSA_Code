public class Practice {

    public static int numbersofKey(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }

        }
        return count;
    }

    // print second Sum row
    public static void rowSumarr(int arr[][], int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum = sum + arr[row][i];
        }
        System.out.println(sum);
    }

    // Transpose of a matrix
    public static void transpose(int arr[][]) {
        System.out.println("after transpose");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
    }

    // without another array Transpose
    // public static void transpose(int arr[][]) {
    // int transpose[][] = new int[arr.length][arr[0].length];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // transpose[j][i] = arr[i][j];
    // }
    // }
    // System.out.println("After transpose");
    // printarr(transpose);
    // }

    
    // print arr
    public static void printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 }, { 1, 2, 3 } };
        // System.out.println(numbersofKey(arr, 7));

        // Print the second row of array element
        int row = 2;
        // rowSumarr(arr, row);

        // Transpose of a matrix
        System.out.println("Before Transpose");
        printarr(arr);
        transpose(arr);
        printarr(arr);
    }
}
