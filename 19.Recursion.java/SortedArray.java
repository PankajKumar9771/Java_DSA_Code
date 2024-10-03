public class SortedArray {

    // public static boolean checkSorted(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (arr[i + 1] < arr[i]) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 3, 4, 5 };
        // System.out.println(checkSorted(arr));
        System.out.println(isSorted(arr, 0));
    }
}
