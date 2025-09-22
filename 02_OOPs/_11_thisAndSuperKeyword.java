
// In Java, this and super are keywords used to refer to objects within a class hierarchy.
// this Keyword:

// The this keyword refers to the current instance of the class in which it is used. 
// Its primary uses include: 
// Referring to Current Class Instance Variables: When a local variable or method parameter has 
// the same name as an instance variable, this.variableName is used to explicitly refer to the 
// instance variable.
class MyClass {
    int value;
    void setValue(int value) {
        this.value = value; // refers to the instance variable 'value'
    }
}

// Invoking Current Class Constructors: this() can be used within a constructor to call 
// another constructor of the same class. This facilitates constructor chaining.
class MyClass2 {
    int value;
    MyClass2(int value) {
        this.value = value;
    }
    MyClass2() {
        this(0); // calls the constructor with an int argument
    }
    
}

// Invoking Current Class Methods: this.methodName() can be used to explicitly call a method of the 
// current class, though it is often implicit.

// Returning Current Class Instance: return this; can be used to return the current object from a method.

// Passing as an Argument: this can be passed as an argument in method or constructor calls when 
// the current object needs to be referenced by another object.


// super Keyword:
// The super keyword refers to the immediate parent class (superclass) of the current object. 
// It is primarily used in the context of inheritance: 
// Referring to Immediate Parent Class Instance Variables: When a subclass has an instance variable 
// with the same name as an instance variable in its superclass, super.variableName is used to access 
// the superclass's variable.
class Animal {
    String color = "white";
}
class Dog extends Animal {
    String color = "black";
    void printColor() {
        System.out.println(color);       // prints "black" (Dog's color)
        System.out.println(super.color); // prints "white" (Animal's color)
    }
}

// Invoking Immediate Parent Class Constructors: super() can be used within a subclass constructor 
// to call a constructor of its immediate superclass. This ensures proper initialization of the 
// parent class's state. super() must be the first statement in the subclass constructor.
class Animal2 {
    Animal2(String name) { /* ... */ }
}
class Dog2 extends Animal2 {
    Dog2(String name) {
        super(name); // calls the Animal constructor
    }
}


// Invoking Immediate Parent Class Methods: super.methodName() is used to call a method of the superclass, 
// particularly when the method has been overridden in the subclass and the superclass's implementation 
// is still needed.
class Animal3 {
    void makeSound() { System.out.println("Animal makes a sound"); }
}
class Cat extends Animal3 {
    @Override
    void makeSound() {
        super.makeSound(); // calls Animal's makeSound()
        System.out.println("Meow!");
    }
}
class _11_thisAndSuperKeyword {
    public static void main(String[] args){
        System.out.println("This and Super Keyword");
    }
}