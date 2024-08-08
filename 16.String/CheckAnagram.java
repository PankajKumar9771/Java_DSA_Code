import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "race", str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str2charArray,str1charArray);
            if (result) {
                System.out.println("Both are anagram");
            } else {
                System.out.println("Both are not anagram of each other");
            }
        } else {
            System.out.println("Both are not anagram of each other");
        }

    }
}
