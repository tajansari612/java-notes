// Java provides two categories of data types: Primitive and Non-Primitive.

// Primitive Data Types
// Primitive types are the most basic data types in Java. 
// There are 8 primitive types categorized based on the type of data they hold:

// 1. Integer Types:

// i.byte:
// Size: 1 byte (8 bits)
// Range: -128 to 127
// Example: 
byte b = 100;

// ii.short:
// Size: 2 bytes (16 bits)
// Range: -32,768 to 32,767
// Example: 
short s = 2000;

// iii.int:
// Size: 4 bytes (32 bits)
// Range: -2³¹ to 2³¹-1 (-2,147,483,648 to 2,147,483,647)
// Example: 
int i = 123456;

// iv.long:
// Size: 8 bytes (64 bits)
// Range: -2⁶³ to 2⁶³-1
// Example: 
long l = 123456789L;
// (Use L to specify long literals)


// 2. Floating-Point Types

// float:
// Size: 4 bytes
// Range: Approximately ±3.40282347E+38F
// Precision: 7 decimal digits
// Example: 
float f = 3.14f;
// (Use f to specify float literals)

// double:
// Size: 8 bytes
// Range: Approximately ±1.79769313486231570E+308
// Precision: 15 decimal digits
// Example: 
double d = 3.14159;


// 3. Character Type
// char:
// Size: 2 bytes (16 bits, Unicode characters)
// Range: '\u0000' (0) to '\uffff' (65,535)
// Example: 
char c = 'A';


// 4. Boolean Type
// boolean:
// Size: 1 bit (logical value)
// Values: true or false
// Example: 
boolean isJavaFun = true;


// Non-Primitive Data Types
// Non-primitive types are more complex and can store multiple values or 
// references to objects.

// i.Strings:
// Represents a sequence of characters.
// Example: 
String name = "Java";


// ii.Arrays:
// Collection of elements of the same type.
// Example: int[] numbers = {1, 2, 3};


// iii.Classes:
// Blueprint for objects.
// Example:
class Car {
    String brand;
    int speed;
}


// iv.Interfaces:
// Define methods without implementation.
// Example:
interface Animal {
    void sound();
}


// v.Enums:
// Represent fixed sets of constants.
// Example:
enum Day { MONDAY, TUESDAY, WEDNESDAY; }


public class _04_dataTypes {
    public static void main(String[] args) {
        
    }
}
