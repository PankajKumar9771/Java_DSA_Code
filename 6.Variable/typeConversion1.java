import java.util.*;

public class typeConversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the price of the  pencil , pen and eraser ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total = pen + pencil + eraser;

        System.out.println("Total price of items " + Total);
        System.out.println("After GST of 18% price will be " + (Total + (18f / 100) * Total));
        sc.close();
    }
}
