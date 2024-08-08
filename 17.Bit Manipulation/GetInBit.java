public class GetInBit {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.println(n & bitMask);
            return 0;
        } else {
            System.out.println(n & bitMask);
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(15, 4));
    }
}
