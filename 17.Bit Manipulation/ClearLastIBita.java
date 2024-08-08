public class ClearLastIBita {
    
    public static int ClearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
       System.out.println( ClearIthBits(15, 2));
    }
}
