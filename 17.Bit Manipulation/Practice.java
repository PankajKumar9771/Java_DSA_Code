public class Practice {

    // Arithematics Swapping
    // public static void swapping(int a, int b) {
    // a = b + a;
    // b = a - b;
    // a = a - b;
    // System.out.println("The value a and b " + a + " ," + b);
    // }

    // Bitwise Swappping
    // public static void swapping(int a, int b) {
    // a = a ^ b;
    // b = a ^ b;
    // a = a ^ b;
    // System.out.println("After the swapping the value of a and b " + a +" "+ b);
    // }

    // Add 1 to an Integer using Bit Manipulation
    public static void add() {
        int x = 6;
        System.out.println(-~x);

        x = -4;
        System.out.println(-~x);

        x = 0;
        System.out.println(-~x);
    }

    // 000000000004 Convert uppercase character in to the lowercase

    // public static void convert() {
    //     for (char ch = 'A'; ch <= 'Z'; ch++) {
    //         System.out.println((char) (ch | ' '));
    //     }
    // }

    ///Convert lowercase to upperCase
    public static void convert() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println((char) (ch & '_'));
        }
    }

    public static void main(String[] args) {
        // swapping(15, 34);
        // add();
        convert();

    }
}

// public class Practice {

// public static void swapping(int[] numbers) {
// numbers[0] = numbers[1] + numbers[0];
// numbers[1] = numbers[0] - numbers[1];
// numbers[0] = numbers[0] - numbers[1];

// System.out.println("The values a and b are: " + numbers[0] + " ," +
// numbers[1]);
// }

// public static void main(String[] args) {
// int[] numbers = { 15, 34 };
// swapping(numbers);
// System.out.println("The swapped values in main are: " + numbers[0] + " ," +
// numbers[1]);
// }
// }
