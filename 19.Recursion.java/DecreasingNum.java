
public class DecreasingNum {

    public static void decreaseNum(int n) {
        // System.out.println(n);
        // if (n != 1) {
        // decreaseNum(n - 1);
        // }

        // Decrasing Order
        if (n == 1) {
            System.out.println("1");
            return;
        }
        System.out.print(n + " ");
        decreaseNum(n - 1);

        // Increasing Order
        // if (n == 8) {
        // System.out.println(8);
        // return;
        // }
        // System.out.print(n + " ");
        // decreaseNum(n + 1);
    }

    public static void increaseNum(int n) {
        if (n == 1) {
            System.out.print("1" + " ");
            return;
        }
        increaseNum(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        // decreaseNum(2);
        increaseNum(8);
    }
}
