// What Are Exceptions in Java?
// An exception in Java is an event that disrupts the normal flow of a program.
// It occurs during runtime and indicates that something went wrong—like invalid input, missing files, failed database connection, division by zero, etc.
// All exceptions in Java are represented by classes that extend java.lang.Throwable.

// Hierarchy:
//                 Throwable
//                /         \
//         Exception       Error
//            /
//   RuntimeException

// Throwable: The Root of All Exceptions
// Throwable has two main subclasses:

// Exception → Issues your program should handle
// Error → Serious system issues you should NOT handle

// 1. Types of Exceptions (Most Important Topic)
// Java has 3 categories:

// A. Checked Exceptions
// Checked at compile time.
// Compiler forces you to either:
// handle them (try-catch) or
// declare them (throws)

// Examples:
// IOException
// SQLException
// ClassNotFoundException
// FileNotFoundException
// InstantiationException

// Usage example:
// try {    
//     FileReader fr = new FileReader("data.txt");
// } catch (FileNotFoundException e) {   
//     e.printStackTrace();
// }

// Why checked exceptions exist?
// To ensure developers handle predictable failures (I/O, database, networking, etc.)



// B. Unchecked Exceptions (Runtime Exceptions)
// Occur at runtime.
// Compiler does NOT force handling.

// Examples:
// NullPointerException
// ArrayIndexOutOfBoundsException
// ArithmeticException
// IllegalArgumentException
// NumberFormatException

// Usage:
// int a = 10 / 0; // ArithmeticExceptionShow more lines

// Why unchecked exceptions exist?
// Because they usually represent programming mistakes:

// forgetting null checks
// invalid arguments
// logic errors


// C. Errors (Not Exceptions)
// Serious problems the application should not try to handle.

// Examples:
// OutOfMemoryError
// StackOverflowError
// VirtualMachineError
// ThreadDeath

// You cannot recover from these.


// 2. Exception Handling Mechanisms
// Java provides 5 keywords:

// try:
// Block of code that may throw an exception.
// try {    
//     int result = 10 / 0;  //Arithmetic Exception
// }

// catch:
// Block that handles the exception.
// catch (ArithmeticException e) {    
//     System.out.println("Division by zero!");
// }

// finally:
// Always executes—whether exception occurs or not.
// finally {    
    // System.out.println("Cleanup code here");
// }
// Uses:
// closing files
// closing DB connections
// releasing resources


// throw:
// Used inside methods to manually throw an exception.
// throw new IllegalArgumentException("Invalid age");

// throws:
// Used in method signature to declare exceptions.
// void readData() throws IOException {    
//      risky code
// }


// 3. Exception Propagation
// How Java moves exceptions up the method call stack.
// Example:
// void a() { 
//     b(); 
// }
// void b() { 
//     c(); 
// }
// void c() { 
//     int x = 10/0; 
// }

// Exception thrown in c() → goes to b() → goes to a() → crashes if unhandled.
// This is propagation.


// 4. Custom Exceptions (Very Important in Real Projects)
// You can create your own exception.
// Example: EmployeeNotFoundException
class EmployeeNotFoundException extends RuntimeException {    
    public EmployeeNotFoundException(Long id) {        
        super("Employee not found with id: " + id);    
    }
}
// Used in a REST project:
// employeeRepo.findById(id)        
//     .orElseThrow(() -> new EmployeeNotFoundException(id));


// 5. Multi-Catch (Java 7+)
// You can catch multiple exceptions in one block:
// catch (IOException | SQLException e) {    
//    e.printStackTrace();
// }


// 6. Exception Best Practices
// Throw exceptions when something unexpected happens
// Use meaningful messages
// Create custom exceptions for business rules
// Log exceptions using SLF4J/Logback
// Never swallow exceptions silently
// Use finally or try-with-resources for closing resources

// Avoid
// using exceptions for normal logic
// catching generic Exception unnecessarily
// printing stack trace without logging

public class _05_Exceptions {
    
}
