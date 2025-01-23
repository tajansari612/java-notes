
//Classes and Objects
// A class is a blueprint for creating objects. It defines the properties and 
// behavior of objects. A class can contain fields, methods, constructors, and
// blocks.

//Example:
class Car {
    //Fields
    String color;
    int speed;
    
    //Methods
    public void dispColor() {
        System.out.println("Color :"+this.color);  //this keyword is used to refer 
                                                   //to the current object
    }
    
    public void dispSpeed() {
        System.out.println("Speed :"+this.speed);
    }
}

//In the above example, the Car class has two fields: color and speed, and two
// methods: dispColor() and dispSpeed(). These fields and methods define the properties and
// behavior of the Car class.

//An object is an instance of a class. It has state and behavior. Objects are
// created using the new keyword followed by the class name.

//Example:
class _02_classes_and_objects {
    public static void main(String[] args) {
        //Creating an object of the Car class
        Car c1 = new Car();
        
        //Setting the values of the fields
        c1.color = "Red";
        c1.speed = 100;
        
        //Calling the methods
        c1.dispColor();
        c1.dispSpeed();

        //Creating an object of the Car class
        Car c2 = new Car();
        
        //Setting the values of the fields
        c2.color = "Green";
        c2.speed = 200;
        
        //Calling the methods
        c2.dispColor();
        c2.dispSpeed();
    }
}

//In the above example, we have created an object c1 of the Car class. We have set
// the values of the fields color and speed using the dot operator. We have also
// called the methods dispColor() and dispSpeed() using the dot operator.

