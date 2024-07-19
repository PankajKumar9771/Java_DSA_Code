// public class ReverseArray {
//     public static int[] reverseNum(int numbers[]) {
//         int reverse[]=new int[numbers.length];
//         for (int i = 0; i < numbers.length; i++) {
//             reverse[i] = numbers[numbers.length-1-i];
//         }

//         return reverse;
//     }
//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 3, 4 };
//         int reverse[] = reverseNum(numbers);
//         for (int i = 0; i < reverse.length; i++) {
//             System.out.println(reverse[i]);
//         }

//     }
// }

// above code is  increase space complexity
public class ReverseArray {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 23, 14, 41, 43 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
