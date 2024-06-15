public class TernaryOperator {
    public static void main(String[] args) {
        int number = 21;
        String type = (number % 2 == 0) ? "even" : "odd";
        System.out.println("Number is " + type);

        //Check pass or fail
        int Marks = 71;
        String Status = (Marks >= 33) ? "Pass" : "Fail";
        System.out.println("Student is "+Status);
    }
}
