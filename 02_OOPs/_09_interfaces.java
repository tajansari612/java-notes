//Interfaces in Java
//An interface is a reference type in Java, similar to a class, that can contain only
// constants, method signatures, default methods, static methods, and nested types.

// Interfaces cannot contain instance fields or constructors. They are used to achieve
// abstraction and multiple inheritance in Java.

//An interface is declared using the 'interface' keyword. A class can implement
// an interface using the 'implements' keyword. A class can implement multiple interfaces.

// All methods in an interface are implicitly public and abstract (except default and static methods).
// Interfaces are useful when you want to define a contract that multiple classes can
// implement, regardless of their position in the class hierarchy.

//It is used to achieve abstraction and multiple inheritance in Java.

//It is also called as pure abstraction because it can have only abstract methods (methods without a body).
interface Animal {
    void sound();  //by default public and abstract and it must be implemented by classes implementing this interface
    void eat();    //by default public and abstract and it must be implemented by classes implementing this interface

    //It does not have a constructor because it cannot be instantiated on its own.
    //It can have default and static methods with a body.
    //It does not hava any non-abstract methods (methods with a body).
    //It can have constants (static and final variables).
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}

public class _09_interfaces {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
        myDog.eat();
        myCat.eat();
    }
}