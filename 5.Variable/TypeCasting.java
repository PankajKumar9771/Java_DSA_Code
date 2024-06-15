public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("We demonstrate the type Casting");
        float a = 44.44f;
        // int b = a; //its give error 

        int b= (int)a; // we convert forcefully without consider about the data losses
        System.out.println("Value of b is " + b);
        
        float marks = 99.9999f;
        int marksNew = (int) marks;
        System.out.println(marksNew);


        // char name = 'a';
        // int value =  name;
        // System.out.println(value);  


        int value = 97;
        char charValue =(char) value;
        System.out.println(charValue);
    }
}
