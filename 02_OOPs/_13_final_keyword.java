// The final keyword in Java is a non-access modifier used to restrict the modification or 
// extension of variables, methods, and classes.

// 1. Final Variables: 
// When a variable is declared final, its value can only be assigned once. After initialization, 
// its value cannot be changed.
// This is commonly used to declare constants.
// Example:
// final int MAX_VALUE = 100;
// MAX_VALUE = 200; // This would result in a compilation error


// 2. Final Methods: 
// When a method is declared final, it cannot be overridden by any subclass.
// This ensures that the method's implementation remains consistent across the inheritance 
// hierarchy.
// Example:
class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // public void display() { } // This would result in a compilation error
}


// 3. Final Classes:
// When a class is declared final, it cannot be extended or inherited by any other class.
// This prevents other classes from modifying the behavior of the final class through inheritance.
// Example:
final class ImmutableClass {
    // Class members
}

// class SubClass extends ImmutableClass { } // This would result in a compilation error
// In summary, the final keyword in Java provides mechanisms to: Create immutable variables 
// (constants), Prevent method overriding, and Prevent class inheritance.

public class _13_final_keyword {
    public static void main(String[] args) {
        
    }
}
