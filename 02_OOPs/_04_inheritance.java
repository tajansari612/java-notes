// Inheritance in Java is a core principle of Object-Oriented Programming (OOP) that allows a class 
// to acquire properties (fields) and behaviors (methods) from another class. This mechanism promotes 
// code reusability and establishes a hierarchical relationship between classes, often referred to as 
// an "is-a" relationship or a parent-child relationship. 

// Key Concepts:
// Superclass/Parent Class: The class whose features are inherited.
// Subclass/Child Class: The class that inherits features from a superclass. It can also be called 
// a derived class or extended class.
// extends keyword: Used to establish the inheritance relationship, indicating that a subclass inherits 
// from a superclass.


// How Inheritance Works:
// When a subclass extends a superclass, it gains access to the public and protected members of the 
// superclass. If the subclass is within the same package as the superclass, it also inherits 
// package-private members. 

// The subclass can then: 
// Use inherited members: Directly utilize the fields and methods inherited from the superclass.
// Add new members: Introduce its own unique fields and methods not present in the superclass.
// Override methods: Provide a specialized implementation for an inherited method, maintaining 
// the same method signature. This enables runtime polymorphism.

// Hide fields or static methods: Declare a field or static method with the same name as one 
// in the superclass, effectively hiding the superclass's version (though this is generally 
// discouraged for fields).

// Benefits of Inheritance:
// Code Reusability: Reduces redundant code by allowing subclasses to reuse logic defined in parent classes.
// Method Overriding/Runtime Polymorphism: Enables the creation of more specific versions of methods in 
// subclasses, leading to dynamic behavior based on the object's actual type.
// Code Organization: Promotes a clear, hierarchical structure within the codebase, making it easier 
// to manage and understand.

// Example:
class Vehicle {
    String brand;

    void go() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {
    int wheels;

    void honk() {
        System.out.println("Beep beep!");
    }
}

public class _04_inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota"; // Inherited from Vehicle
        myCar.wheels = 4;      // Specific to Car

        myCar.go();   // Inherited method
        myCar.honk(); // Specific method
    }
}