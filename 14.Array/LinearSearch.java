public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 20, 12, 32, 23, 23 };
        int key = 12;
        int indexNumber = linearSearch(numbers, key);
        if (indexNumber == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Key is at index : " + indexNumber);
        }
    }
}