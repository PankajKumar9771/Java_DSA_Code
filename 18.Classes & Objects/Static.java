public class Static {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.schoolName = "JMD";
        // // System.out.println(s1.schoolName);

        // Student s2 = new Student();
        // s2.schoolName = "JMDM";
        // System.out.println(s2.schoolName);
        // System.out.println(s1.schoolName);

        System.out.println(Student.add(123, 44, 44));

        // Advantages of Static Methods:

        // 1. No Need for Instantiation:
        // Static methods can be called without creating an object of the class. This is
        // useful for utility methods like add and multiply that perform operations
        // independent of the instance state.

        // 2. Shared Functionality:
        // Static methods provide shared functionality across all instances of the
        // class, or even when no instances exist.

    }
}

class Student {
    String name;
    int roll;

    static int add(int chem, int phy, int math) {
        return chem + phy + math;
    }

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
