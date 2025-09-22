// Java supports various types of inheritance, which define how classes can inherit properties and behaviors
// from other classes. 

// These types are:
// Single Inheritance: In single inheritance, a class inherits from only one other class. 
// This establishes a simple parent-child relationship where one subclass extends one superclass.
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}


// Multilevel Inheritance: Multilevel inheritance involves a chain of inheritance, where a class inherits 
// from another class, which in turn inherits from a third class. This creates a hierarchy of parent-child 
// relationships.

class Animal2 {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class BabyDog2 extends Dog2 {
    void weep() {
        System.out.println("BabyDog weeps.");
    }
}


// Hierarchical Inheritance: In hierarchical inheritance, multiple classes inherit from a single superclass. 
// This means that one parent class has several child classes, each extending its functionalities.
class Animal3 {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("Cat meows.");
    }
}


// Multiple Inheritance (Supported through Interfaces): Java does not support multiple inheritance 
// with classes directly to avoid the "diamond problem." However, it achieves a form of multiple 
// inheritance through interfaces. A class can implement multiple interfaces, thereby inheriting 
// method signatures and achieving a similar effect of combining functionalities from various sources. 
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies.");
    }

    public void swim() {
        System.out.println("Duck swims.");
    }
}

// Hybrid Inheritance: Hybrid inheritance is a combination of two or more types of inheritance. 
// For example, a combination of hierarchical and multilevel inheritance can form a hybrid inheritance 
// structure. This is also achieved in Java by combining class inheritance with interface implementation. 