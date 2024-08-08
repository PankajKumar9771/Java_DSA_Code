public class Constructors {

    public static void main(String[] args) {

        // Student s1 = new Student("Pankaj");
        // System.out.println(s1.name);

        /// copyConstructor
        Student s1 = new Student();
        s1.name = "sharadha";
        s1.roll_no = 123;
        s1.password = "absc";
        s1.marks[0] = 98;
        s1.marks[1] = 99;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);
        // Using this line all thing copy in s2 but we now change in s1 then he reflect
        // in s2

        s2.password = "xyz";

        s1.marks[1] = 100;
        // copy hone ke bad jab ham s1 me change kar rhe hai tab bhi s2 me reflect kar
        // rha hai idialy aisa nahi hona chahiye
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

/////////////////////////// Copy Constructor
class Student {
    String name;
    int roll_no;
    String password;
    int marks[];

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        this.marks = s1.marks;
    }

    // Constructor

    Student() {
        marks = new int[3];
        System.out.println("Constructors has invoked");
    }

    // Student(String name) {
    // this.name = name;
    // }

    // Student(int roll_no) {
    // this.roll_no = roll_no;
    // }

}

///////////////////////// 00000000000000000000000111111111111111111111111
///////////////////////// Constructor 1st
// class Student {
// String name;
// int roll_no;

// // Constructor
// // Student(String name) {
// // this.name = name;
// // }

// Student() {
// System.out.println("Constructors has invoked");
// }
// }
