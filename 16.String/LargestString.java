public class LargestString {

    public static void main(String[] args) {
        String fruit[] = { "apple", "mango", "banana" ,"mangp"};
        String largest = fruit[0];

        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }
        System.out.println("Largest fruit name is " + largest);
    }
}
