//Hybrid inheritance (combination of multiple and multilevel inheritance):
// A class that uses a combination of multiple and multilevel inheritance.
public class Main {
    public static void main(String[] args) {
        MusicCar objA = new MusicCar();
        objA.play();
        objA.drive();
        objA.park();
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

interface Music {
    void play();
}

class MusicCar extends Car implements Music {
    void play() {
        System.out.println("Playing music...");
    }
}