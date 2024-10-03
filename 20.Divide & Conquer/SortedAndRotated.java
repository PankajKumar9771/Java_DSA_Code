// public class SortedAndRotated {

//     public static int search(int arr[], int target, int si, int ei) {
//         if (si > ei) {
//             return -1;
//         }

//         int mid = si + (ei - si) / 2;
//         if (arr[mid] == target) {
//             return mid;
//         }

    //     // Check if mid is in the left sorted part (L1)
    //     if (arr[si] <= arr[mid]) {
    //         if (arr[si] <= target && target <= arr[mid]) {
    //             return search(arr, target, si, mid - 1);
    //         } else {
    //             return search(arr, target, mid + 1, ei);
    //         }
    //     } else { // mid is in the right sorted part (L2)
    //         if (arr[mid] <= target && target <= arr[ei]) {
    //             return search(arr, target, mid + 1, ei);
    //         } else {
    //             return search(arr, target, si, mid - 1);
    //         }
    //     }
    // }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int target = 0;
//         int tarIdx = search(arr, target, 0, arr.length - 1);
//         System.out.println(tarIdx);
//     }
// }




public class SortedAndRotated {

    public static int search(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            // Check if the mid element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[si] <= arr[mid]) {
                // Check if the target is in the left half
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid - 1; // Move to the left half
                } else {
                    si = mid + 1; // Move to the right half
                }
            } else { // Right half is sorted
                // Check if the target is in the right half
                if (arr[mid] <= target && target <= arr[ei]) {
                    si = mid + 1; // Move to the right half
                } else {
                    ei = mid - 1; // Move to the left half
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int tarIdx = search(arr, target);
        System.out.println(tarIdx);
    }
}
