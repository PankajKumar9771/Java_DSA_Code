public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

        if (sb instanceof StringBuilder) {
            System.out.println("sb is a StringBuilder.");
        }

        String str = sb.toString();
        if (str instanceof String) {
            System.out.println("str is a String.");
        }

        // String and stringBuilder both are diffrent
    }
}
