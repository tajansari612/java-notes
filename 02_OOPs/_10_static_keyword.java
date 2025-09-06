// Static keyword in Java is used for memory management primarily. 
// It can be applied to variables, methods, blocks, and nested classes.

// When a member is declared static, it belongs to the class rather than
// to any specific instance of the class. This means that there is only one copy
// of the static member, regardless of how many objects of the class are created

// Static members can be accessed directly using the class name without creating
// an instance of the class. However, static methods can only directly access
// other static members (variables and methods) of the class.

// Static members are initialized only once at the start of the program execution
// and remain in memory until the program terminates. This makes static members
// more memory efficient when you need to share data or behavior across all instances
// of a class.

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