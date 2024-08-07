public class CountSort {

    public static void sorting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];// because 0 to range
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            System.out.println(count[i]);
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 9,8,6,343,434,242};
        int arr[] = {5,4,1,3,2};
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
