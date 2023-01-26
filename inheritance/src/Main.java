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
        //constructor overloading ka part and calling it with this keyword
        Person c = new Person("Ajay Kumar", 52);
        System.out.println(c.age + " " + c.name);
        // inheritance ka part h
        Developer dev = new Developer("Abhinav", 22);
        dev.walk(); //ye function apne parent se inherit kar liya
    }
}
class Person { // yaha par person naam ka class banaye
    String name;
    int age;
    //method - behaviour banaye person ka
    void walk() {
        System.out.println(name + " " + "is walking");
    }
    // method ke arguments
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
    public Person(String name, int age) { //ye h constructor overloading with this keyword
        this.name = name;
        this.age = age;
    }
}
class Developer extends Person { // ye ho gaya inheritance
    public Developer(String name, int age) {
        super(name, age); // super jo h wo apne parent k constructor ko call karne k kaam ata h
    }
//    void walk() {  // ye h runtime polymorphism
//        System.out.println("Engineer" + name + " " + "is walking");
//    }
}