public class Main {
    public static void main(String[] args) {
        Person a = new Person(); // yaha par object banaye
        a.age = 26;
        a.name = "Abhisek";
        //yaha multiple oblects banaya ja sakta h sirf ek class se
        Person b = new Person();
        b.age = 21;
        b.name = "Abhinav";
        System.out.println(a.age + " " + a.name);
        System.out.println(b.age + " " + b.name);
        //yaha method ko bula (call) rahe
        a.walk();
        b.eat();
        //method ke arguement ko call kiya
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
}