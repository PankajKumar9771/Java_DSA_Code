import java.util.*;

public class PrintCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (char j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}


// import java.util.*;

// public class PrintCharacter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 4;
//         char ch = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (char j = 1; j <=i+4; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


// public class PrintSequence {
//     public static void main(String[] args) {
//         char startChar = 'A';
//         int groupSize = 5;

//         while (startChar <= 'Z') {
//             for (int i = 0; i < groupSize; i++) {
//                 if (startChar > 'Z') {
//                     break;
//                 }
//                 System.out.print(startChar);
//                 startChar++;
//             }
//             System.out.println();
//             groupSize++;
//         }
//     }
// }
