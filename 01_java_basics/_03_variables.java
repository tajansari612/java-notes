public class _03_variables {
    public static void main(String[] args) {

        // In Java, variables are containers that hold data, and data types 
        // define the type of data a variable can store. 
        // Here’s an overview:

        // Variables in Java
        // Types of Variables:

        // 01.Local Variables:
        // Declared inside a method, constructor, or block.
        // Scope is limited to where they are declared.
        // Must be initialized before use.
        
        // void method() {
        //     int localVar = 10; // Local variable
        // }


        // 02.Instance Variables:
        // Declared outside methods but inside a class (non-static).
        // Each object of the class has its own copy.
        // Default initialized based on the data type.
        
        // class MyClass {
        //     int instanceVar = 5; // Instance variable
        // }


        // 03.Static Variables:
        // Declared with the static keyword.
        // Shared among all instances of the class.
        // Accessed using the class name.
        
        // class MyClass {
        //     static int staticVar = 20; // Static variable
        // }


        
    }
}

// Rules for Declaring Variables:

// 1. Strict Rules (Enforced by the Java Compiler):
// If you violate these rules, your code will not compile and will throw a syntax error:

// Allowed Characters: Variable names can only contain letters (A-Z, a-z), numbers (0-9), underscores (_), 
// and dollar signs ($). No other special characters (like @, #, %, -) or spaces are allowed.

// Starting Character: A variable name must begin with a letter, an underscore (_), or a dollar sign ($). 
// It cannot begin with a number.
// Valid: age, _name, $salary, value1
// Invalid: 1stPlace, my-var, total amount

// Case Sensitivity: Java is strictly case-sensitive. This means myVariable, MyVariable, and MYVARIABLE 
// are treated as three completely different variables.

// Reserved Keywords: You cannot use any of Java's reserved keywords as a variable name. Words like int, 
// class, public, static, void, if, and for have special meaning in Java and are off-limits for naming.


// 2. Standard Conventions (Best Practices):
// While the compiler won't stop you from breaking these rules, every professional Java developer follows 
// them to keep code readable and maintainable:

// camelCase Naming: Variable names should start with a lowercase letter. If the name consists of 
// multiple words, the first letter of each subsequent word should be capitalized.
// Example: firstName, employeeSalary, maximumSpeedLimit

// Be Descriptive: Choose names that clearly describe what the variable holds. Avoid single-letter 
// variables unless they are used as temporary counters in a loop (like i, j, k).
// Good: customerAge, isOrderComplete
// Bad: a, c, flag

// Avoid Starting with $ or _: Even though it is legally allowed, it is standard practice to avoid starting 
// normal variables with underscores or dollar signs. The $ symbol is often reserved for compiler-generated 
// code, and _ is sometimes used in specific frameworks or for internal library variables.

// Constants in UPPERCASE: If a variable is meant to be a constant (declared with final), it should be 
// written in all uppercase letters with words separated by underscores (known as SCREAMING_SNAKE_CASE).
// Example: final int MAX_USERS = 100;, final double PI_VALUE = 3.14159;

