public class CheckpowOf2 {

    public static boolean checkPow(int n) {
        return (n & n - 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkPow(16));
    }
}
