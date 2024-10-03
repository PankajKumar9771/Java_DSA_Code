// public class NQueens {

//     public static boolean isSafe(char board[][], int row, int col) {
//         // Vertical Up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         // Diag Left Up
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         // Diag Right Up
//         for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; j++, i--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void nQueens(char board[][], int row) {
//         if (board.length == row) {
//             // printBoard(board);

//             // To calculate the total ways we can count;
//             count++;
//             return;
//         }

//         // Column Loop
//         for (int j = 0; j < board.length; j++) {
//             if (isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row + 1); // function call
//                 board[row][j] = 'X';
//             }

//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("----------------------------------------------------");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board, 0);

//         System.out.println("Total ways to solve n queens count = " + count);
//     }

// }

public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diag Left Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diag Right Up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; j++, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char board[][], int row) {
        if (board.length == row) {
            printBoard(board);

            // To calculate the total ways we can count;
            // count++;
            return true;
        }

        // Column Loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                // function call
                board[row][j] = 'X';
            }

        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
 
    // static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }

        // System.out.println("Total ways to solve n queens count = " + count);
    }

}
