// The static keyword in Java is a non-access modifier that indicates a member 
// (variable, method, block, or nested class) belongs to the class itself, rather than 
// to individual instances (objects) of the class. This means that static members are 
// shared among all instances of the class and can be accessed without creating an object of that class. 

// Here's a breakdown of its uses:

// Static Variables (Class Variables):
// Declared using the static keyword.
// Shared by all objects of the class; there is only one copy of a static variable for the entire class. 
// Initialized only once, when the class is loaded into memory. 
// Useful for representing common properties among all objects, like a company name for employees 
// or a college name for students.

// Static Methods (Class Methods):
// Declared using the static keyword.
// Can be called directly using the class name, without creating an object of the 
// class (e.g., ClassName.staticMethod()).
// Can only access other static members (variables and methods) of the class directly. 
// They cannot access non-static (instance-specific) variables or methods without an object reference.
// The main method in Java is a common example of a static method, as it is the entry point for program execution and needs to be called without an object.


// Static Blocks:
// Used for initializing static variables.
// Executed automatically once, when the class is loaded into memory, before any static methods 
// are called or any objects are created.


// Static Nested Classes:
// A nested class declared as static.
// Unlike non-static inner classes, a static nested class does not require an instance of 
// the outer class to be created.
// Can only access static members of the outer class directly. 


// Example to illustrate the use of static keyword in Java
class StaticExample {
    static int staticVariable = 0;  // static variable
    int instanceVariable = 0;        // instance variable

    static {
        // Static block
        staticVariable = 10;
        System.out.println("Static block initialized");
    }

    public static void staticMethod() {
        System.out.println("Static method called");
    }

    public void instanceMethod() {
        System.out.println("Instance method called");
    }
}

public class _10_static_keyword {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.instanceVariable = 5;
        obj2.instanceVariable = 10;

        System.out.println("Object 1 instance variable: " + obj1.instanceVariable);
        System.out.println("Object 2 instance variable: " + obj2.instanceVariable);

        StaticExample.staticVariable = 15;
        System.out.println("Static variable: " + StaticExample.staticVariable);

        obj1.staticMethod();
        obj1.instanceMethod();
    }
}
// Output:
// Static block initialized
// Static method called
// Instance method called