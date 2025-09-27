// An anonymous inner class in Java is a local inner class that is declared and instantiated 
// without a name. It is primarily used when a class is needed for a single, specific purpose 
// and does not require a formal name or repeated instantiation.


// Key characteristics of anonymous inner classes:
// No Name: As the name suggests, they do not have an explicit name. The Java compiler generates 
// a name for them internally.

// Local Scope: They are defined within a method, constructor, or initializer block, 
// limiting their scope to that specific context.

// Single Object Creation: Anonymous classes are typically used to create a single instance 
// of a class or implement an interface on the fly.

// Cannot Have Explicit Constructors: Since they lack a name, explicit constructors cannot be 
// defined for anonymous classes.

// Can Extend a Class or Implement an Interface: An anonymous inner class can either extend 
// an existing class (abstract or concrete) or implement an interface, but not both simultaneously.

// Access to Enclosing Scope: They can access members (including private ones) of the enclosing 
// class or method where they are defined, provided those members are effectively final 
// (or final in older Java versions).


// When to use anonymous inner classes:
// Event Handling: Commonly used in GUI programming (e.g., AWT, Swing, JavaFX) to implement 
// listener interfaces for handling events, such as button clicks.

// Thread Creation: For creating Runnable objects to be executed in a new thread.
// Providing On-the-Fly Implementations: When a simple, one-time implementation of an interface 
// or an abstract class is required, avoiding the need to create a separate, named class file.

// Example:
interface Greeting {
    void sayHello();
}

public class _03_anonymous_inner_class {
    public static void main(String[] args) {
        // Anonymous inner class implementing the Greeting interface
        Greeting englishGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        englishGreeting.sayHello(); // Output: Hello!

        // Anonymous inner class extending a concrete class
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous thread.");
            }
        });

        myThread.start(); // Output: Running in an anonymous thread.
    }
}