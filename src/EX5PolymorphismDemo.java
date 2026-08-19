// Program to demonstrate Polymorphism in Java

// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Derived class 3 (Fixed: Added class declaration)
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class
public class EX5PolymorphismDemo {
    public static void main(String[] args) {
        Shape s; // Parent class reference variable

        s = new Circle();    // Reference refers to Circle object
        s.draw();            // Output: Drawing a Circle

        s = new Rectangle(); // Reference refers to Rectangle object
        s.draw();            // Output: Drawing a Rectangle

        s = new Triangle();  // Reference refers to Triangle object
        s.draw();            // Output: Drawing a Triangle
    }
}
