public class Inheritaince {

    public static void main(String[] args) {
        // Single Level
        // Fish shark = new Fish();
        // shark.eat();

        // MultiLevel Inheritaice
        // Dog dobby = new Dog();
        // dobby.legs = 4;
        // dobby.breed = "African";
        // dobby.eat();
        // System.out.println(dobby.legs + " " + dobby.breed);

        // Hierarchial Inheritaince
        // Bird parrot = new Bird();
        // parrot.eat();
        // parrot.fly();
        // parrot.walk();//Its not access because this property is of mammmels

    }
}

// Hybrid Inheritaince

//Chatgpt not say its example of Hybrid its

// class Animal {
//     String Color;

//     void eat() {
//         System.out.println("Eating");
//     }

//     void breate() {
//         System.out.println("breathe");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("Swim");
//     }
// }

// class Tuna extends Fish {
//     void tuna() {
//         System.out.println("Tuna");
//     }
// }

// class Shark extends Fish {
//     void shark() {
//         System.out.println("Shark");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("flying");
//     }
// }

// class Peacock extends Bird {
//     void peacock() {
//         System.out.println("I am peacoock");
//     }
// }

// class Mammel extends Animal {
//     void walk() {
//         System.out.println("Walkng");
//     }
// }

// class Dog extends Mammel {
//     String breed;
// }

// class Human extends Mammel {
//     String laugh;
// }



//Its example of Hybrid class by Chatgpt
// class Animal {
//     void eat() {
//         System.out.println("Eating");
//     }
// }

// class Mammal extends Animal {
//     void walk() {
//         System.out.println("Walking");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("Flying");
//     }
// }

// // Hybrid inheritance example
// class Bat extends Mammal {
//     void fly() {
//         System.out.println("Bat is flying");
//     }
// }








// Hierarchial Inheritaince
// class Animal {
// String Color;

// void eat() {
// System.out.println("Eating");
// }

// void breate() {
// System.out.println("breathe");
// }
// }

// class Mammel extends Animal {
// void walk() {
// System.out.println("walking");
// }
// }

// class Fish extends Animal {
// void swim() {
// System.out.println("Swimming");
// }
// }

// class Bird extends Animal {
// void fly() {
// System.out.println("Flying");
// }
// }

// Multilevel Inheritaince
// class Animal {
// String Color;

// void eat() {
// System.out.println("Eating");
// }

// void breate() {
// System.out.println("breathe");
// }
// }

// class Mammel extends Animal {
// int legs;
// }

// class Dog extends Mammel {
// String breed;
// }

// Single Inheritaince
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swims");
// }
// }























//Multiple Inheritaice is not exist in java but i just want to try what happens

// class Animal {
//     int legs;
// }

// class Human {
//     int laugh;
// }

// class Cow extends Animal ,Human{  // this is not allowed in java

// }