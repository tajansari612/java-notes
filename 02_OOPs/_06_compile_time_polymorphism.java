//Compile-time polymorphism in Java is achieved through method overloading.

class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

// Operator Overloading
// Java does not support operator overloading like C++.
// Java does not support user-defined operator overloading, which means 
// developers cannot define custom behavior for operators like +, -, *, or / 
// when used with their own classes.
// The only operator that is overloaded in Java is the '+' operator.
// The '+' operator is used for both addition and string concatenation.
// Example of operator overloading
class OperatorOverloading {
    public void demo() {
        int a = 10, b = 20;
        System.out.println("Sum: " + (a + b)); // Addition
        String str1 = "Hello, ", str2 = "World!";
        System.out.println("Concatenation: " + (str1 + str2)); // String concatenation
    }
}
public class _06_compile_time_polymorphism {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println("Integer addition: " + math.add(5, 10));
        System.out.println("Double addition: " + math.add(5.5, 10.5));
        System.out.println("String addition: " + math.add("Hello, ", "World!"));
    }
}
