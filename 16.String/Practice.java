import java.util.Scanner;

public class Practice {

    // Count how mmany times print lowercase vowels
    public static void countVowels() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels is " + count);

    }

   

    public static void main(String[] args) {
        countVowels();
        String str = "ApnaCollege".replace("o", "m");
        System.out.println(str);


    }
}
