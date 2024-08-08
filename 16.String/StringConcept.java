import java.util.Scanner;

public class StringConcept {

    public static void printChar(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
    }

    public static String subString(String str, int si, int ei) {
        String Substring = "";
        for (int i = si; i < ei; i++) {
            Substring += str.charAt(i);
        }
        return Substring;
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        // String str = "abcdef";
        // String str2 = new String("xyz");
        // System.out.println(arr[3]);

        // String are Immutable in Java It means string can't be changed its only
        // changed by make it copy.

        // Input
        Scanner sc = new Scanner(System.in);
        // String fullName = sc.next(); Its take only one word.

        // String fullName = sc.nextLine();
        // System.out.println(fullName);

        // String Length

        // System.out.println(fullName.length());

        // Concatenation
        String firstName = "Pankaj";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        // System.out.println(firstName + lastName);

        // String CharAt
        // System.out.println(firstName.charAt(3));

        // printChar(fullName);

        //// 0008
        // String Compare from another string
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        // if (s1 == s3) {
        // System.out.println("Both are s1 and s3 same");
        // } else {
        // System.out.println("Not same");
        // }
        // if (s1 == s2) {
        // System.out.println("Both are s1 and s3 same");
        // } else {
        // System.out.println("Not same");
        // }

        // For String Compaare we used
        // its check string value anot object add
        // if (s1.equals(s3)) {
        // System.out.println("Both are s1 and s3 same");
        // } else {
        // System.out.println("Not same");
        // }

        /// 0000000099
        // SubString

        String str = "HelloWorld";
        // System.out.println(subString(str, 0, 5));
        // InBuilt function that find substring

        System.out.println(str.substring(0, 5));
    }

}
