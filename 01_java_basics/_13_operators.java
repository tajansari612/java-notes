public class _13_operators {
    public static void main(String[] args) {
        //operators
        //Operators are special symbols in Java that carry out arithmetic or logical computation. The value that the operator operates on is called the operand.
        //For example: 1 + 2, where + is an operator that performs addition on operands 1 and 2.
        //Operators in Java can be classified into the following types:
        //1. Arithmetic Operators
        //2. Relational Operators
        //3. Logical Operators
        //4. Bitwise Operators
        //5. Assignment Operators
        //6. Unary Operators
        //7. Ternary Operator
        //8. instanceof Operator
        //9. new Operator

        
        //1. Arithmetic Operators
        //Arithmetic operators are used to perform mathematical operations like addition, subtraction, multiplication, etc.
        //Example:
        int a = 10;
        int b = 20;
        int c = a + b; // Addition
        System.out.println(c); // Output: 30
        int d = a - b; // Subtraction
        System.out.println(d); // Output: -10
        int e = a * b; // Multiplication
        System.out.println(e); // Output: 200
        int f = b / a; // Division
        System.out.println(f); // Output: 2
        int g = b % a; // Modulus
        System.out.println(g); // Output: 0


        //2. Relational Operators
        //Relational operators are used to check the relationship between two operands. If the relation is true, it returns true; otherwise, it returns false.
        //Example:
        int x = 10;
        int y = 20;
        System.out.println(x > y); // output: false  (greater than)
        System.out.println(x < y); // output: true  (less than)
        System.out.println(x == y); // output: false  (equal to)
        System.out.println(x != y); // output: true  (not equal to)
        System.out.println(x >= y); // output: false  (greater than or equal to)
        System.out.println(x <= y); // output: true  (less than or equal to)


        //3. Logical Operators
        //Logical operators are used to perform logical operations like AND, OR, and NOT.
        //Example:
        boolean p = true;
        boolean q = false;
        System.out.println(p && q); // Output: false  (AND)
        System.out.println(p || q); // Output: true  (OR)
        System.out.println(!p); // Output: false  (NOT)


        //4. Bitwise Operators
        //Bitwise operators are used to perform bitwise operations on integer operands.
        //Example:
        int m = 5; // 101
        int n = 7; // 111
        System.out.println(m & n); // Output: 5 (AND)
        System.out.println(m | n); // Output: 7 (OR)
        System.out.println(m ^ n); // Output: 2 (XOR)
        System.out.println(~m); // Output: -6 (NOT)
        System.out.println(m << 1); // Output: 10 (Left shift) (Multiply by 2)
        System.out.println(m >> 1); // Output: 2 (Right shift) (Divide by 2)


        //5. Assignment Operators
        //Assignment operators are used to assign values to variables.
        //Example:
        int n1 = 10;
        n1 += 5; // n1 = n1 + 5
        System.out.println(n1); // Output: 15
        int n2 = 10;
        n2 -= 5; // n2 = n2 - 5
        System.out.println(n2); // Output: 5
        int n3 = 10;
        n3 *= 5; // n3 = n3 * 5
        System.out.println(n3); // Output: 50
        int n4 = 10;
        n4 /= 5; // n4 = n4 / 5
        System.out.println(n4); // Output: 2
        int n5 = 10;
        n5 %= 5; // n5 = n5 % 5
        System.out.println(n5); // Output: 0
        

        //Misc Operators
        //Misc operators include the conditional operator, instanceof operator, new operator, etc.

        //6. Unary Operators
        //Unary operators are used to perform operations on a single operand.
        //Example:
        int n6 = 10;
        System.out.println(++n6); // Output: 11  (Increment)
        System.out.println(--n6); // Output: 10  (Decrement)
        System.out.println(+n6); // Output: 10  (Unary plus)
        System.out.println(-n6); // Output: -10  (Unary minus)
        System.out.println(~n6); // Output: -11  (Bitwise complement)
        System.out.println(!true); // Output: false  (Logical complement)

        
        //7. Ternary Operator
        //The ternary operator is a conditional operator that evaluates a boolean expression and returns one of the two expressions based on the result of the evaluation.
        //Example:
        int h = 10;
        int i = (h == 10) ? 20 : 30; // If h is equal to 10, then i is assigned 20; otherwise, i is assigned 30.
        System.out.println(i); // Output: 20


        //8. instanceof Operator
        //The instanceof operator is used to test whether an object is an instance of a particular class or interface.
        //Example:
        String str = "Hello";
        System.out.println(str instanceof String); // Output: true (str is an instance of the String class)


        //9. new Operator
        //The new operator is used to create an instance of a class or an array
        //Example:
        String str1 = new String("Hello");  // Create a new instance of the String class
        System.out.println(str1); // Output: Hello 

    }
}
