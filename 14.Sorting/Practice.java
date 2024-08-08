//Sort of array

// buuble sort
// selection sort
// insertion sort
// counting sort

// in descending order

public class Practice {

    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Counting Sort
    // public static void counting(int arr[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // largest = Math.max(largest, arr[i]);
    // }

    // int count[] = new int[largest + 1];
    // for (int i = 0; i < arr.length; i++) {
    // count[arr[i]]++;
    // }

    // int j = 0;
    // for (int i = 0; i < count.length; i++) {
    // while (count[i] > 0) {
    // arr[j] = i;
    // j++;
    // count[i]--;
    // }
    // }

    // }

    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
            // count[arr[i]]++;

        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            arr[j] = i;
            j++;
            count[arr[i]]--;
        }
    }

    // Print ArraY
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // int arr[] = { 5, 4, 3, 2, 1 };
        // bubbleSort(arr);
        // SelectionSort(arr);
        insertionSort(arr);
        // counting(arr);
        print(arr);

    }
}
