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
    }
}
class Person { // yaha par person naam ka class banaye
    String name;
    int age;
}