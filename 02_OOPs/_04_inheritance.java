// Inheritance: It is a mechanism in which one class acquires the property of another class.
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
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

//Type of Inheritance
// 1. Single Inheritance: A class inherits from one superclass.
// 2. Multilevel Inheritance: A class inherits from a superclass, and another class inherits from that subclass.
// 3. Hierarchical Inheritance: Multiple classes inherit from a single superclass.
// 4. Hybrid Inheritance: A combination of two or more types of inheritance.
// Note: Java does not support multiple inheritance (a class cannot inherit from more than one class)
// to avoid ambiguity. However, it can be achieved using interfaces.
public class _04_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
