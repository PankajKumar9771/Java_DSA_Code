public class AbstractClass {
    public static void main(String[] args) {
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();
        // Chicken c1 = new Chicken();
        // c1.walk();
        // c1.eat();
        // System.out.println(h1.color);
        // h1.changeColor();
        // System.out.println(h1.color); //
        // Animal a1 = new Animal(); // we can't create instances of abstract classes

        Mustang m1 = new Mustang(); // It's explain how an constructor hierarchy worked
    }
}

class Animal {
    Animal() {
        System.out.println("Animal called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Called");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang called");
    }
}

// abstract class Animal {
// String color;

// Animal() {
// color = "brown";
// }

// void eat() {
// System.out.println("Eating all Animal");
// }

// abstract void walk();
// // It's not make implementation it's give only idea.
// }

// class Horse extends Animal {
// void changeColor() {
// color = "narrow-brown";
// }

// void walk() {
// // This is mandatory to utilize this when we extends abstract class it is
// // mandatory to use abstract method/Function
// System.out.println("Horse are four legs ");
// }
// }

// class Chicken extends Animal {
// void changeColor() {
// color = "white";
// }

// void walk() {
// System.out.println("Their are are only two legs");
// }
// }

// Interface: Use an interface when you need to define a contract for what a
// class should do, without caring about how it does it. Useful when you want to
// ensure that multiple classes implement the same set of methods.

// Abstract Class: Use an abstract class when you have a base class that
// provides some common behavior or default implementation that should be shared
// across multiple subclasses.