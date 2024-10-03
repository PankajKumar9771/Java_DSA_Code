public class RemoveDuplicate {

    public static void removeDuplicatesChar(String str, StringBuilder newStr, boolean map[], int idx) {
        if (str.length() == idx) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicatesChar(str, newStr, map, idx + 1);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicatesChar(str, newStr.append(currChar), map, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicatesChar(str, new StringBuilder(""), new boolean[26], 0);
    }
}
