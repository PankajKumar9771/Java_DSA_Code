public class Practice2 {
    public static int search(int[] nums, int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            // Left hand
            if (nums[mid] > nums[start]) {
                if (key >= nums[start] && key < nums[mid]) {
                    end = mid - 1;
                } else { 
                    start = mid + 1;
                }
            }
            // Right Hand
            else {
                if (key <= nums[end] && key > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 2, 3 };
        int key = 2;
        System.out.println("The key of index is : " + search(nums, key));
    }
}