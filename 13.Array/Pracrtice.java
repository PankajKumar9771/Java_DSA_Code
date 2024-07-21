public class Pracrtice {

    public static boolean CheckOccurence(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 4, 5, 6, 10};
        System.out.println(CheckOccurence(numbers));
    }
}
