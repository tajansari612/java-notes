// Polymorphism in Java
// Polymorphism is a concept by which we can perform a single action in different ways.
// The word polymorphism means "many forms". In Java, polymorphism is mainly divided
// into two types:  
// 1. Compile-time polymorphism (or static polymorphism)
// 2. Runtime polymorphism (or dynamic polymorphism)

// Compile-time polymorphism
// Compile-time polymorphism is achieved by method overloading and operator overloading.

// Method Overloading
// Method overloading is a feature that allows a class to have more than one method with
// the same name, but with different parameters (different type, number, or both).

// Example of method overloading
// class MathOperation {
//     public int add(int a, int b) {
//         return a + b;
//     }
//
//     public double add(double a, double b) {
//         return a + b;
//     }
//
//     public String add(String a, String b) {
//         return a + b;
//     }
// }

// Operator Overloading
// Java does not support operator overloading like C++.
// The only operator that is overloaded in Java is the '+' operator.
// The '+' operator is used for both addition and string concatenation.
// Example of operator overloading
// class OperatorOverloading {
//     public void demo() {
//         int a = 10, b = 20;
//         System.out.println("Sum: " + (a + b)); // Addition
//         String str1 = "Hello, ", str2 = "World!";
//         System.out.println("Concatenation: " + (str1 + str2)); // String concatenation
//     }
// }    


// Runtime polymorphism
// Runtime polymorphism is achieved by method overriding.
// Method overriding is a feature that allows a subclass to provide a specific implementation
// of a method that is already defined in its superclass.
// When a method in a subclass has the same name, same parameters or signature, and same return type
// as a method in its superclass, then the method in the subclass is said to override the method in the superclass.
// Example of method overriding
// class Animal {
//     public void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class Cat extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("Cat meows");
//     }
// }

public class _04_polymorphism {
    public static void main(String[] args) {
        
    }
}
