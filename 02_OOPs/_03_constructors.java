// Constructor is a special method that is used to initialize objects.
// A constructor has the same name as the class and does not have a return type.
// A constructor is called when an object is created using the new keyword.
// If a class does not have a constructor, the Java compiler automatically creates
// a default constructor.

// Rules for creating a constructor:
// A constructor must have the same name as the class.
// A constructor must not have a return type.
// A constructor must not be static.
// A constructor can have access modifiers.
// A constructor can have parameters.
// A constructor can be overloaded.
// A constructor can call another constructor using the this keyword.
// A constructor can call the constructor of the superclass using the super keyword.

// Types of constructors:
// 1. Default constructor: A constructor that does not have any parameters is called a 
// default constructor.

// 2. Parameterized constructor: A constructor that has parameters is called a 
// parameterized constructor.

// 3. Copy constructor: A constructor that initializes an object using another 
// object of the same class is called a copy constructor.

// 4. Constructor chaining: Calling one constructor from another constructor is 
// called constructor chaining.


class Student {
    String name;
    int age;

    // Constructor
    // Default Constructor
    public Student(){
        System.out.println("Default Constructor called!");
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void dispInfo(){
        System.out.println("Name :"+this.name);
        System.out.println("Age: "+this.age);
    }
}

public class _03_constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.dispInfo();

        Student s2 = new Student("John", 25);
        s2.dispInfo();
    }    
}
