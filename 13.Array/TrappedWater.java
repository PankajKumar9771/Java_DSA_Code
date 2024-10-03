public class TrappedWater {

    public static int TrapWater(int height[]) {

        int n = height.length;
        // calculate the max array boundries ---left
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate the max array boundries ---Right
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);

        }

        
//         for (int i = 0; i < rightMax.length; i++) {
//             System.out.print(rightMax[i]+" ");
//         }
// System.out.println();
//         for (int i = 0; i < leftMax.length; i++) {
//             System.out.print(leftMax[i]+" ");
//         }

        // loop
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftbound ,rightbound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapWater = waterlevel-height
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrapWater(height));
    }
}
