//Lambda Experessions:
// Lambda expressions in Java, introduced in Java 8, are a concise way to represent 
// an anonymous function or a block of code. 
// They are primarily used to provide an inline implementation for functional interfaces, 
// which are interfaces with a single abstract method.

// Key Characteristics of Lambda Expressions:
// Anonymous: They do not have a name, unlike traditional methods.
// Concise Syntax: They offer a more compact and readable way to write code compared 
// to anonymous inner classes.
// Functional Interface Implementation: They are designed to implement the single abstract method
// of a functional interface.
// Functional Programming: They enable functional programming paradigms in Java, 
// allowing functions to be treated as first-class citizens and passed as arguments to methods.

// Syntax of Lambda Expressions:
// The basic syntax of a lambda expression is:
// (parameters) -> expressionBody

// parameters: This can be empty, a single parameter (without parentheses if type inference 
// is possible), or multiple parameters (enclosed in parentheses, with or without 
// type declarations).
// ->: This is the lambda operator, separating the parameters from the body.
// expressionBody: This can be a single expression, which is implicitly returned, or a 
// block of statements enclosed in curly braces {}. 
// If it's a block, a return statement is required for methods that return a value.

// Example of Lambda Expressions:
@FunctionalInterface        // Ensures the interface has exactly one abstract method
interface Hello {
    void sayHello();
}
@FunctionalInterface        // Ensures the interface has exactly one abstract method
interface Calculator {
    int calculate(int a, int b);
}
// Reason for having functional interface is to ensure that the interface has exactly one abstract method.
// If there are multiple abstract methods, the compiler will throw an error.
// If there multiple abstract methods are present, then we cannot use lambda expressions 
// to implement the interface.
// Because lambda expressions can only provide implementation for a single method.
// If we try to use lambda expression with an interface having multiple abstract methods,
// the compiler will not know which method to implement, leading to ambiguity and errors.   


// class HelloTaj implements Hello {
//     @Override
//     public void sayHello(){
//         System.out.println("Hello Taj");
//     }
// }
public class _04_lambda_expressions {
    public static void main(String[] args) {
        // Hello h1 = new HelloTaj();
        // h1.sayHello();

        //Using anonymous inner class
        Hello h1 = new Hello()  {
            @Override
            public void sayHello(){
                System.out.println("Hello Taj");
            }
        };
        h1.sayHello();

        //Using lambda expression
        Hello taj = () -> System.out.println("Hello Taj in Lambda");
        taj.sayHello();

        Hello ayaj = () -> System.out.println("Hello Ayaj in Lambda");
        ayaj.sayHello();
        

        // Example with parameters and return type
        Calculator add = (a,b) -> a+b;
        System.out.println(add.calculate(5, 06));

        Calculator sub = (a,b) -> {
            return a-b;
        };
        System.out.println(sub.calculate(8, 04));

    }
}
