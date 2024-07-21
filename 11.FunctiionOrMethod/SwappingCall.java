import java.util.*;

public class SwappingCall {

    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a after swapping " + a);
        System.out.println("Value of b after swapping " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 12;
        int b = 33;
        System.out.println("The value of  a before swapping " + a);
        System.out.println("The value of b  before swapping " + b);
        swapping(a, b);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(
                "After the value of a and b is original is not changed because when we pass argument in function its makes its own copy not change in original because we used call by value if we used call by refrence then it change its actual value of a and b");
        sc.close();
    }
}
