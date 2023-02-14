//Multilevel inheritance: A subclass extends a superclass, and another subclass extends that subclass, creating a hierarchy.
public class Main {
    public static void main(String[] args) {
        Dog objA = new Dog();
        objA.bark();
        objA.eat();
        objA.run();
    }
}
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Running...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}