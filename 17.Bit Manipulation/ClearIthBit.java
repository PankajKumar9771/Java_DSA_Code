public class ClearIthBit {

    public static int clearBit(int n, int i) {
        int bitMask = ~(i << 1);
        return n & bitMask;
    }
    public static void main(String[] args) {
    System.out.println(clearBit(10, 0));
    }
}


// change 1 to zero