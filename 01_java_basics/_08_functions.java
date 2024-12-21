// A function in Java (referred to as a "method") is a block of code within a 
// class that performs a specific task and may return a value.

// Syntax of a Function (Method)
// accessModifier returnType methodName(parameterList) {
//     // method body
// }

// Components of a Function:

// Access Modifier: Specifies the visibility of the function.
// public, protected, private, or default (no keyword).

// Return Type: Specifies the type of value the function returns.
// Use void if the function doesn't return a value.

// Method Name: A valid identifier following camelCase convention.

// Parameter List: Inputs passed to the method (optional).
// Can be zero or more parameters.

// Method Body: Contains the logic of the function.

class tmp{
    

    // Types of Functions in Java:

    // 1. Based on Return Type
    // Void Functions: Do not return any value.
    void greet() {
        System.out.println("Hello, World!");
    }

    // Functions with Return Value: Return a value of the specified type.
    int add(int a, int b) {
        return a + b;
    }


    // 2. Based on Parameters
    // Without Parameters:
    void sayHello() {
        System.out.println("Hello!");
    }

    // With Parameters:
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// 3. Based on Context

// Instance Functions: Belong to an object and require an instance of the class 
// to call.
class MyClass {
    void show() {
        System.out.println("Instance Function");
    }
}

// Static Functions: Belong to the class and can be called without creating an object.
class MyClass2 {
    static void display() {
        System.out.println("Static Function");
    }
}


//Example
public class _08_functions {
    public static void greet() {
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        greet();
    }
}
