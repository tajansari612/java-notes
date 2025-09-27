// In Java, an inner class is a class defined within another class or interface. 
// It is also known as a non-static nested class. 
// Inner classes are associated with an instance of their enclosing class and have direct access 
// to all members (including private members) of that outer class. 

// Here are the key characteristics and uses of inner classes:

// Encapsulation and Organization: Inner classes provide a way to logically group classes 
// that are closely related and primarily used within the context of the outer class. 
// This enhances encapsulation and code organization.

// Access to Outer Class Members: An inner class instance is implicitly associated with 
// an instance of its outer class. This allows the inner class to directly access all 
// members (fields and methods), including private ones, of the outer class instance. 

// Instantiation: To create an instance of an inner class, you must first create an instance 
// of the outer class. Then, you create the inner class instance using the outer class instance. 
// OuterClass outerObject = new OuterClass();
// OuterClass.InnerClass innerObject = outerObject.new InnerClass();

// No Static Members: Inner classes cannot define static members (fields or methods) themselves 
// because they are associated with an instance of the outer class, not the class itself.


// Uses:
// Helper Classes: Inner classes are often used as helper classes that are specific to the 
// functionality of the outer class and are not intended for general use elsewhere.

// Event Handling: They are commonly used in GUI programming for implementing event listeners, 
// where the listener class is tightly coupled with the component it's listening to.

// Logical Grouping: When a class is conceptually part of another class and its existence 
// doesn't make sense outside that context, an inner class provides a suitable structure.

// Accessing Private Members: Inner classes can be used to access private members of the outer 
// class, which can be useful for specific design patterns or controlled access.


// Types of Inner Classes:
// Member Inner Class: A class defined directly within another class, outside of any method.

// Local Inner Class: A class defined within a method, constructor, or block. It has a limited 
// scope and can only be accessed within that specific block.

// Anonymous Inner Class: An inner class without a name, typically used for implementing an 
// interface or extending a class for a single, immediate use.
// Example:
class OuterClass {
    private int outerVar = 10;

    class InnerClass {
        void display() {
            System.out.println("Value from outer class: " + outerVar);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class _02_inner_class {
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        outer.createInner(); // Calls the method that creates and uses the inner class
    }

}
