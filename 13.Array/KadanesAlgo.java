public class KadanesAlgo {

    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int maximumElement = Integer.MIN_VALUE;

        // check for the all negative element

        for (int i = 0; i < numbers.length; i++) {

            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
            maximumElement = Math.max(maximumElement, numbers[i]);
        }
        if (ms == 0 && maximumElement < 0) {
            ms = maximumElement;
        }
        System.out.println("Our Maximum sub array sum is " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -4, -6, -8, -10 };
        Kadanes(numbers);
    }
}