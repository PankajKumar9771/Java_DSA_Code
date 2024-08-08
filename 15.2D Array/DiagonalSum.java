public class DiagonalSum {

    // This is the bruteForce that gives the bigoh(n2);
    // public static void AllDiagonalSum(int matrix[][]) {
    // int sum = 0;
    // int n = matrix.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == j) { // Primary Diagonal
    // sum = sum + matrix[i][j];
    // }
    // if ((i + j) == n - 1) {
    // sum = sum + matrix[i][j]; // Secondary Diagonal
    // }

    // }
    // }
    // // For Odd size matrix
    // if (n % 2 != 0) {
    // sum = sum - matrix[n / 2][n / 2];

    // }
    // System.out.println(sum);
    // }

    public static void AllDiagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum = sum + matrix[i][i]; // Primary Diagonal
            if (i != n - 1 - i) {
                sum = sum + matrix[i][n - 1 - i];// Secondary Diagoanal
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11, }
        };
        AllDiagonalSum(arr);

    }
}