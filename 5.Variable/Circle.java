
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of radius");
        float radius = sc.nextFloat();
        // float area = 3.14 * radius * radius; its give error;
        float area = 3.14f * radius * radius; 

System.out.println(area);
        // System.out.println("Area of circle is "+(3.14*radius*radius));
        sc.close();
    }
}
