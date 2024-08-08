public class BubbleSorting {

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // boolean swap = false;
            int count = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swap = true;
                }
                count++;
            }
            // if (!swap) {
            //     System.out.println("Array is already sorted");
            //     break;
            // }
            if (count >0) {
                System.out.println("Array is already sorted");
                break;
            }
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 4, 2, 2, 1, 5, 6, 7, 9 }; // not sorted then time complexity is
        // bigoh(n2);

        int arr[] = { 1, 2, 3, 4, 5 };// this time complexity is too much less
        bubbleSort(arr);
        // Print the arrray

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
