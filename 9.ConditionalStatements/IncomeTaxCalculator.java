import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Income Tax Calculator");
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Salary ");
        float Salary = sc.nextFloat();
 if (Salary<=500000) {
    System.out.println("Tax is 0% on the salary");
    System.out.println("After Tax Salary  is "+Salary);
} else if (Salary > 500000 && Salary <= 1000000) {
    System.out.println("Tax is 20% on the salary");
    System.out.println("After Tax Salary  is " + (Salary*20/100));
}
 else if (Salary > 1000000) {
        System.out.println("Tax is 30% on the salary");
    System.out.println("After Tax Salary  is "+(Salary*30/100) );
 }
        sc.close();
    }
}
