public class _11_typecasting_And_String_Parsing {
    public static void main(String[] args) {
        // Type Casting
        // Type casting is when you assign a value of one primitive data type to 
        // another type.
        
        // In Java, there are two types of casting:
        // 1. Widening Casting (automatically) - converting a smaller type to a larger
        // type size
        // byte -> short -> char -> int -> long -> float -> double
        // Example:
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Output: 9
        System.out.println(myDouble); // Output: 9.0

        // 2. Narrowing Casting (manually) - converting a larger type to a smaller type
        // size
        // double -> float -> long -> int -> char -> short -> byte
        // Example:
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2); // Output: 9.78
        System.out.println(myInt2); // Output: 9

        // Note: When you are converting from a smaller type to a larger type size, it is
        // called automatic type conversion and it is done by the compiler.
        // When you are converting from a larger type to a smaller type size, it is
        // called explicit type conversion or casting and you need to do it manually.


        
        // String Parsing
        // Parsing is the process of converting one data type to another.
        // In Java, you can parse a string to an integer using the parseInt() method of
        // the Integer class.
        // Example:
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num); // Output: 123

        // Similarly, you can parse a string to a double using the parseDouble() method
        // of the Double class.
        // Example:
        String str2 = "123.45";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2); // Output: 123.45
        
        // Note: If the string does not contain a parsable integer or double, you will
        // get a NumberFormatException.

        // You can also parse a string to a float using the parseFloat() method of the
        // Float class.
        // Example:
        String str3 = "123.45";
        float num3 = Float.parseFloat(str3);
        System.out.println(num3); // Output: 123.45

        // You can also parse a string to a long using the parseLong() method of the
        // Long class.
        // Example:
        String str4 = "123";
        long num4 = Long.parseLong(str4);
        System.out.println(num4); // Output: 123

        // You can also parse a string to a short using the parseShort() method of the
        // Short class.
        // Example:
        String str5 = "123";
        short num5 = Short.parseShort(str5);
        System.out.println(num5); // Output: 123

        // You can also parse a string to a byte using the parseByte() method of the
        // Byte class.
        // Example:
        String str6 = "123";
        byte num6 = Byte.parseByte(str6);
        System.out.println(num6); // Output: 123

        // Note: The parse methods of the wrapper classes (Integer, Double, Float, Long,
        // Short, Byte) are used to parse strings to their corresponding primitive data
        // types.

        // You can also use the valueOf() method of the wrapper classes to parse strings
        // to their corresponding primitive data types.
        // Example:
        String str7 = "123";
        int num7 = Integer.valueOf(str7);
        System.out.println(num7); // Output: 123

        // Note: The valueOf() method returns an Integer object, so you need to cast it
        // to an int.

        // You can also use the toString() method of the wrapper classes to convert
        // primitive data types to strings.
        // Example:
        int num8 = 123;
        String str8 = Integer.toString(num8);
        System.out.println(str8); // Output: 123

        // Note: The toString() method returns a String object.


    }
}