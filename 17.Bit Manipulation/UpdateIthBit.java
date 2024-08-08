public class UpdateIthBit {

    public static int GetInBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateBit(int n, int i, int newBit) {
        // This is the basic
        // if (newBit == 0) {
        // return ClearIthBit(n, i);
        // } else {
        // return setBit(n, i);
        // }

        // Advanced
        n = ClearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        // System.out.println(GetInBit(15, 4));
        // System.out.println(setBit(10, 2));
        // System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateBit(10, 2, 1));
    }
}
