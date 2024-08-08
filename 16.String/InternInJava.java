public class InternInJava {
    public static void main(String[] args) {
        String str = new String("Hello World").intern();
        String str2 = new String("Hello World");
        String str1 = "Hello World";

        System.out.println(str1.intern() == str);

    }
}
