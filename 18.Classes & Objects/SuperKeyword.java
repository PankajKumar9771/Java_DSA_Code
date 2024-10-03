public class SuperKeyword {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.color);
        // Animal a1 = new Animal();
        // System.out.println(a1.color); //super not changed in parent
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("ANimal constructor is called");
    }
}

class Dog extends Animal {
    // super.color="brown";
    Dog() {
        // super.color = "brown";
        // super(); //If i donot write this then automatic called super
        System.out.println("Dog was called");
    }
}