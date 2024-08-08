public class CountSetBits {

    public static int CountBits(int n) {
        int bitMask = 1;
        int count = 0;
        while (n > 0) {
            if ((n & bitMask) != 0) {
                count++;
            }
            n = n >> bitMask;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountBits(3));
    }
}
