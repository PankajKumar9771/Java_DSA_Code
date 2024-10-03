public class FindLastOccurence {

    // public static int lastOccurence(int arr[], int i, int key) {
    // if (arr[i] == key) {
    // return i;
    // }
    // if (i == 0) {
    // return -1;
    // }

    // return lastOccurence(arr, i - 1, key);
    // }

    public static int lastOccurence(int arr[], int i, int key) {
    if (i == arr.length) {
    return -1;
    }
    int isFound = lastOccurence(arr, i + 1, key);
    if (isFound==-1 && arr[i] == key) {
    return i;
    }

    return isFound;
    }  

    // public static int lastOccurence(int arr[], int key) {
    //     for (int i = arr.length - 1; i >= 0; i--) {
    //         if (arr[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 2 };
        // // int i = arr.length - 1;
        // System.out.println(lastOccurence(arr, i, 9));
        System.out.println(lastOccurence(arr, 0, 2));
        // System.out.println(lastOccurence(arr, 2));
    }
}
