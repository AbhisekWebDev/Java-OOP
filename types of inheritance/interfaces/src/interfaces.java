//Multiple inheritance (not directly supported in Java, but achieved through interfaces):
// A class implements multiple interfaces.
public class interfaces implements car, person {
    public static void main(String[] args) {

    }
    public void start() {
        System.out.println("car is starting");
    }

    @Override
    public void walk() {
        System.out.println("person is starting");
    }
}
interface car {
    void start();
}
interface person {
    void walk();
}
