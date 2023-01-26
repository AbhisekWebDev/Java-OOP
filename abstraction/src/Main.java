public class Abstraction {
    public static void main(String[] args) {
        Audi a = new Audi();           // abstract class car k children ka object banaye
        BMW b = new BMW();
        a.start();
        b.start();
    }
    class Audi extends Car {
        @Override
        void start() {
            System.out.println("Audi is starting");
        }
    }
    class BMW extends Car {
        @Override
        void start() {
            System.out.println("BMW is starting");
        }
    }
    abstract class Car {   // abstract ka object nhi bana sakte
        int price;
        // abstract method ko override karna hi hoga
        abstract void start();
    }
}