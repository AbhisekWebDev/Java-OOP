//Hierarchical inheritance: Multiple subclasses extend the same superclass.
public class Main {
    public static void main(String[] args) {
        Rectangle objA = new Rectangle();
        objA.drawRectangle();
        objA.draw();
        Circle objB = new Circle();
        objB.drawCircle();
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing shape...");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing circle...");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing rectangle...");
    }
}