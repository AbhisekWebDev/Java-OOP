//Single inheritance: A subclass extends only one superclass.
public class Main {
    public static void main(String[] args) {
       Car objA = new Car();
        objA.park();
       objA.drive();
    }
}
class Vehicle {
    void drive() {
        System.out.println("Driving vehicle...");
    }
}

class Car extends Vehicle {
    void park() {
        System.out.println("Parking car...");
    }
}