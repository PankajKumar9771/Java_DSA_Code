public class Practice {

    // 000001// Find the all occurrences
    public static void findAllOccurrences(int arr[], int key, int i) {
        if (arr.length == i) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }

        findAllOccurrences(arr, key, i + 1);
    }

    // 00000000002 Convert the number to the string

    static String Digits[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void printDigits(int number) {

        if (number == 0) {
            return;
        }

        int lasDigit = number % 10;
        printDigits(number / 10);
        System.out.print(Digits[lasDigit] + " ");
    }

    /// 000000000003 Find the length of the String

    public static int stringLength(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return stringLength(str.substring(1)) + 1;
    }

    public static void substring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int start = i;
            for (int j = i; j < str.length(); j++) {
                int end = j;

                // System.out.println(str.substring(start, end + 1)); //To print the alll
                // substring

                if (str.charAt(start) == str.charAt(end)) {
                    System.out.println(str.substring(start, end + 1));
                    count++;
                }

                // rather than this we make this using the str.substring
                // for (int k = start; k <= end; k++) {
                // System.out.print(str.charAt(k) + " ");
                // }
                // System.out.println();
            }
            // System.out.println();
        }

        System.out.println("Total substring that starting and ending char is same is count = " + count);

    }

    public static int countSubstrings(String s, int start) {
        if (start == s.length()) {
            return 0;
        }

        int count = 0;
        for (int end = start; end < s.length(); end++) {
            if (s.charAt(start) == s.charAt(end)) {
                count++;
            }
        }
        count = count + countSubstrings(s, start + 1);

        return count;
    }

    public static int countSubstrings2(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrings2(str, i + 1, j, n - 1) + countSubstrings2(str, i, j - 1, n - 1)
                - countSubstrings2(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res = res + 1;
        }
        return res;
    }

    // Tower Of Honoi
    public static void towerOfHonoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // transfer top n-1 from src to helper using dest as a helper
        towerOfHonoi(n - 1, src, dest, helper);
         // transfer n-1 from helper to dest using src as helper
        towerOfHonoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 4, 4, 5, 4, 3 };
        // findAllOccurrences(arr, 3, 0);

        ///// 0002
        // printDigits(2019);

        /// 000003
        // System.out.println(stringLength("Pankaj"));

        // 0004 /////Find the string substring
        // substring("abcab");//Without recursion

        // System.out.println(countSubstrings("aba", 0));

        // String str = "aba";
        // int n = str.length();
        // System.out.println(countSubstrings2(str, 0,n-1,n));

        int n = 2;
        towerOfHonoi(n, "A", "B", "C");
    }
}
