// In Java, an exception is an event that occurs during the execution of a program 
// that disrupts the normal flow of the program's instructions. 
// It is an object that is thrown at runtime when an error or an unexpected event occurs. 

// Key characteristics of exceptions in Java:
// Disrupt normal flow: When an exception occurs, the program's usual sequence of operations 
// is interrupted. Without proper handling, this can lead to the program terminating abruptly.
// 
// Represented as objects: In Java, exceptions are objects, specifically instances of classes 
// that inherit from the java.lang.Throwable class. 
// This allows them to carry information about the error, such as its type and the program's state
// when it occurred.
//
// Mechanism for error handling: Java's exception handling mechanism, using try, catch, finally, 
// and throw statements, provides a structured way to manage and respond to these exceptional 
// events, preventing program crashes and allowing for graceful recovery or informative 
// error messages.


// Types of Exceptions: Java exceptions are broadly categorized into two main types:
// 1. Checked Exceptions: These are exceptions that the compiler checks at compile time. 
// If a method might throw a checked exception, it must either handle the exception 
// (using a try-catch block) or declare that it throws the exception (using the throws keyword 
// in its signature). Examples include IOException, SQLException, and ClassNotFoundException.
//
// 2. Unchecked Exceptions (Runtime Exceptions): These exceptions are not checked at compile time 
// and typically occur due to programming errors. They are subclasses of 
// java.lang.RuntimeException. Examples include NullPointerException, 
// ArrayIndexOutOfBoundsException, and ArithmeticException.


// Purpose of Exception Handling: The primary purpose of exception handling is to:
// Maintain normal program flow: By catching and handling exceptions, the program can recover 
// from errors and continue execution, rather than crashing.
//
// Separate error-handling code from main logic: This improves code readability and maintainability 
// by isolating the code that deals with errors.
//
// Provide informative error messages: Exception handling allows developers to present 
// user-friendly error messages or log detailed information for debugging.


public class _05_Exceptions {
    public static void main(String[] args) {
        // Example of handling an unchecked exception (ArithmeticException)
        
        int a = 10;
        int b = 0;
        try {       // The purpose of the try block is to wrap the code that might throw an exception.
            int result = a/b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {   // The catch block is used to handle the exception that was thrown in the try block.
                                            // The catch block catches the exception and allows the program to continue running.
            System.out.println("Error: " + e.getMessage());
        }
    }

}
