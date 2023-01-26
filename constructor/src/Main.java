public class Main {
    public static void main(String[] args) {
        Person a = new Person(); // yaha par object banaye
        a.age = 26;
        a.name = "Abhisek";
        //yaha multiple objects banaya ja sakta h sirf ek class se
        Person b = new Person(); // new keyword ke baad jo bhi call kare wahi constructor hota
        b.age = 21;
        b.name = "Abhinav";
        System.out.println(a.age + " " + a.name);
        System.out.println(b.age + " " + b.name);
        //yaha method ko bula (call) rahe
        a.walk();
        b.eat();
        //method ke argument ko call kiya
        a.walk(2);
    }
}
class Person { // yaha par person naam ka class banaye
    String name;
    int age;
    //method - behaviour banaye person ka
    void walk() {
        System.out.println(name + " " + "is walking");
    }
    // method ke arguement
    void walk(int steps) { // yahi h polymorphism kyunki yaha void walk k multiple form bane h, void walk() aur void walk(int steps)
        System.out.println(name + " " + "is walking" + " " + steps + " " + "steps per second");
    }
    void eat() {
        System.out.println(name + " " + "is eating");
    }
    static int count;
    public Person() {// constructor ka naam aur class ka naam same hota aur ye constructor banaya gaya h
        count++;
        System.out.println("this is a constructor" + " " + count);
    }
    public Person(int newName, int newAge) { //ye h constructor overloading

    }
}