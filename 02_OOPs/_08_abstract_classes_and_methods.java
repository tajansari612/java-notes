// Abstract class and method example
// An abstract class is a class that cannot be instantiated on its own and must be subclassed.
// It can contain abstract methods (methods without a body) that must be implemented by subclasses.
// Abstract classes are used to provide a common interface and share code among related classes.
// Abstract classes are declared using the 'abstract' keyword.

// Abstract methods are also declared using the 'abstract' keyword and do not have a body.
// They must be implemented by any concrete subclass.
// Abstract classes can have both abstract and concrete methods (methods with a body).
// Abstract classes can also have member variables and constructors.
// Abstract classes are useful when you want to define a common interface for a group of related classes
// but do not want to provide a complete implementation for that interface.

abstract class Animal {
    public abstract void sound();  //must be implemented by subclasses
    public void eat() {         //may or may not be overridden by subclasses
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class _08_abstract_classes_and_methods {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}