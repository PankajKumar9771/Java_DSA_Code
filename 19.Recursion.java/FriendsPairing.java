public class FriendsPairing {

    public static int friendPairing(int n) {

        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // // Choices
        // // Single
        // int fnm1 = friendPairing(n - 1);

        // // Pairing
        // int fnm2 = friendPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // int totalWays = pairWays + fnm1;
        // return totalWays;

        // make above code in to the consise ways
        return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
