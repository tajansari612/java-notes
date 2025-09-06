//Runtime Polymorphism in Java
// Runtime polymorphism in Java is achieved through method overriding.
// It allows a subclass to provide a specific implementation of a method 
// that is already defined in its superclass.
// When a method in a subclass has the same name, same parameters or signature,
// and same return type as a method in its superclass, then the method in the subclass
// is said to override the method in the superclass.


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

public class _07_runtime_polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}
