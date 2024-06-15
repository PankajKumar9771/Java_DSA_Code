public class typePromotion {
    public static void main(String args[]) {
        // char a = 'a';
        // char b = 'b';
        // char c = (char)(b - a);
        //  this is calculatae like value of b 98 and Ascii value of 97 then calculate is 1 and the symbol is smile

        // System.out.println("value of c "+c);

        // System.out.println("value of a in the  form of char "+a);

        // System.out.println("value of b in the form of char "+b);
        // System.out.println("value of b "+ (int)(b));
        // System.out.println("value of a "+ (int)(a));
        // System.out.println("type promotion of expression is "+(b-a));

        // short a = 5;
        // byte b = 25;
        // char c = 'A';

        // byte bt =  (byte)(a + b + c); // its expression all gives value of in integer then we not assigned in byte then we need to convert the all data into byte or type cast

        // System.out.println(bt);

        // double a = 123;
        // float b = 2354.5f;
        // long c = 343;

        // double d = (int) (a + b + c); //its output give in double;

        // double d = a + b + c;

        // System.out.println(d);


        byte b = 5;
        // byte a = b * 2; // its give error because expression is converted in to the int and cannot assign in to the byte

        byte a = (byte) (b * 2);
        System.out.println(a );
    }
}

//Type Promotion in Expression

// 1. byte, int , short ,char all expression is converted in to integer values because integer data types more storage size of another data type.

// 2. double , long , float all expression are converted in double 
