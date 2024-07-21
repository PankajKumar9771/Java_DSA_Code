import java.util.*;
public class allConditional {
    public static void main(String[] args) {

        //00000000000001
        // int age = 19;
        // // int age = 15;

        // if (age > 18) {
        //     System.out.println("You are adult and do anything that a normal person do that");

        // } else {
        //     System.out.println("You are not adult ");
        // }

        // 0002222
    // find the largest number in two
    // int a = 120;
    // int b = 30;
    // if (a > b) {
    //     System.out.println("A is greather then b");
    // }  if(b>a) {
    //     System.out.println("B is greater than a");
    // }


    //00000000000000033
    //check number is odd or even
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value of number");
   int Number = sc.nextInt();
   if (Number % 2 == 0) {
       System.out.println("Given number is Even");
   }
   else {
    System.out.println("odd number");
   }
   sc.close();
    
    
    }
}
