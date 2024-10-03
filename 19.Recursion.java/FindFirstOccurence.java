public class FindFirstOccurence {

    public static int firstOccurence(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int secondOccurence(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
            if (count == 2) {
                return i;
            }
        }

        return -1;
    }


    public static int recursiveFirstOccurence(int arr[], int i,int key) {
        if (arr.length == i) {
            return -1;
        } 
      
        if (arr[i] == key) {
            return i;
        }
      
        return recursiveFirstOccurence(arr, i + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2};
        // System.out.println( firstOccurence(arr, 1));
        System.out.println(secondOccurence(arr, 1));

        // System.out.println(recursiveFirstOccurence(arr,0,13));
    }
}
