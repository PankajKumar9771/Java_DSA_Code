public class AllOperator {
    public static void main(String args[]) {
        System.out.println("Demonstrate the all Operators in java");
        int a = 20;
        int b = 39;
        System.out.println("Sum of a and b = " + (a + b));
        System.out.println("Sub of a and b = " + (a - b));
        System.out.println("Mul of a and b = " + (a * b));
        System.out.println("Div of a and b = " + (a / b));
        System.out.println("Modulo of a and b = " + (a % b));

        System.out.println("As a same type of relational operators ==, <,>,>=,<=");
        System.out.println("Assignment operator are = ,+= , -= ,/= ,*=");
        System.out.println(
                "Logical operator are those operator that define the logic between two or more statement  && ,|| ,!");

                //Pre Increment
        int d = 10;
       int e = ++d;  //  here first value of d is increment then assign in the e
        System.out.println("value of e " + e);
        System.out.println("value of d is " + d);
        

        //Post increment 
         int f = 10;
       int g= f++;  //  here first value of d is assign then increment
        System.out.println("value of e " + g);
        System.out.println("value of d is "+f);
    }
}