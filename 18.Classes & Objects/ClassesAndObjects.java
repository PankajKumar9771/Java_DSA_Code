public class ClassesAndObjects {

    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // // p1.setColor("yellow");
        // p1.color = "Yellow";
        // System.out.println(p1.color);

        /// 0002
        BankAccount myAccount = new BankAccount();
        myAccount.username = "PankajKumar";
        // myAccount.password = "abcdefgh"; //This give error because we can't access
        // password outside the class
        myAccount.setPassword("abcdefghi");
        System.out.println(myAccount.username);
        // System.out.println(myAccount.password);// We can't print

        // 000033 Getters And Setters
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // p1.setColor("yellow");
        p1.setColor("yelow");
        System.out.println(p1.getColor());
    }
}

/// 00003
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

/// 000002 Access Specifiers
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

/// 00001
// class Pen {
// String color;
// int tip;

// void setColor(String newColor) {
// color = newColor;
// }

// void setTip(int newTip) {
// tip = newTip;
// }
// }

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}