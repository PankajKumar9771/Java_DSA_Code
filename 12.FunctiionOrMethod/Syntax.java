import java.util.*;

public class Syntax {

    //function / method

    // Acces
    public static void PrintHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintHello(); // calling function
        sc.close();
    }
}