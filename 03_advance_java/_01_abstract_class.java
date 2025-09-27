// An abstract class in Java is a class that is declared with the abstract keyword. 
// It serves as a blueprint for other classes and cannot be instantiated directly, 
// meaning you cannot create an object of an abstract class.

// Here are the key characteristics of an abstract class in Java:
// Cannot be instantiated: You cannot create objects of an abstract class using the new keyword.

// Can contain abstract methods: Abstract methods are methods declared without an implementation 
// (no method body) and are also marked with the abstract keyword. 
// Subclasses extending the abstract class must provide implementations for all inherited 
// abstract methods, unless the subclass itself is declared abstract.

// Can contain concrete methods: Abstract classes can also have regular, non-abstract methods 
// with full implementations, providing default behavior that subclasses can inherit.

// Can have constructors: Even though an abstract class cannot be instantiated, it can still 
// have constructors. These constructors are called when a subclass is instantiated and can be 
// used to initialize fields in the abstract class. 

// Can contain member variables: Abstract classes can declare and use variables, including final, 
// static, and non-static variables. 

// Purpose of Abstract Classes:
// Abstract classes are used to achieve abstraction in Java, which involves hiding internal 
// details and showing only necessary functionality. They define a common interface and 
// potentially some common behavior for a group of related classes, while leaving the specific 
// implementation details of certain methods to be defined by the subclasses. 
// This promotes code reusability and ensures that subclasses adhere to a defined structure.
// Example:

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method - no implementation
    public abstract void makeSound();

    // Concrete method - with implementation
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
public abstract class _01_abstract_class {
    public static void main(String[] args) {
        // Animal animal = new Animal("Generic Animal"); // This would be an error
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.makeSound(); // Output: Buddy barks.
        dog.eat();       // Output: Buddy is eating.

        cat.makeSound(); // Output: Whiskers meows.
        cat.eat();       // Output: Whiskers is eating.
    }
}
