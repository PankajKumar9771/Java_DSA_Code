// public class BinaryStringProblem {

//     public static void printBinaryString(int n, int lastPlace, StringBuilder str) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }

//         // Add '0' and recursively generate the rest of the string
//         str.append('0');
//         printBinaryString(n - 1, 0, str);
//         str.deleteCharAt(str.length() - 1); // Remove the last character after the recursive call

//         // If the last place was '0', we can add '1'
//         if (lastPlace == 0) {
//             str.append('1');
//             printBinaryString(n - 1, 1, str);
//             str.deleteCharAt(str.length() - 1); // Remove the last character after the recursive call
//         }
//     }

//     public static void main(String[] args) {
//         printBinaryString(3, 0, new StringBuilder());
//     }
// }

// using only string 

public class BinaryStringProblem {

    public static void printBinaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // if (lastPlace == 0) {
        // printBinaryString(n - 1, 0, str + ("0"));
        // printBinaryString(n - 1, 1, str + ("1"));
        // } else {
        // printBinaryString(n - 1, 0, str + ("0"));
        // }

        printBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
