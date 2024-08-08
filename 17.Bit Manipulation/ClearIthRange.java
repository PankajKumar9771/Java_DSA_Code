public class ClearIthRange {

    public static int clearRangeOfBits(int num, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return bitMask & num;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(15, 2, 4));
    }
}
