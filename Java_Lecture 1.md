# Object-Oriented Programming (OOP) Basics in Java

In Java, **OOP** is a paradigm that organizes software design around data (objects) and operations (methods). The key concepts are:

1. Classes & Objects
2. Encapsulation
3. Inheritance
4. Polymorphism
5. Abstraction

## 1. Classes and Objects

1) **Class:** A blueprint for creating objects. It defines the properties (fields) and behaviors (methods) that the objects will have.
2)**Object:** An instance of a class. When a class is defined, no memory is allocated. Memory is allocated when an object is created.
   ---// Define a class
class Car {
    // Fields (properties)
    String color;
    String model;
    
    // Method (behavior)
    void startEngine() {
        System.out.println("The engine is starting...");
    }
}

// Create an object
public class Main {
    public static void main(String[] args) {
        // Create an object of Car class
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model S";
        
        // Call a method
        myCar.startEngine();
        
        // Display object properties
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car model: " + myCar.model);
    }
}



