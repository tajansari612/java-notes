
// In Java, == and equals() are both used for comparison, but they serve different purposes 
// depending on whether you are comparing primitive types or objects.

// 1. == (Equality Operator):
// Primitives: When used with primitive data types (like int, char, boolean, float, double, byte, 
// short, long), == compares their actual values. If the values are identical, it returns true; 
// otherwise, it returns false.

// int a = 5;
// int b = 5;
// boolean result = (a == b); // result will be true

// Objects: When used with objects, == compares their memory addresses (references). 
// It returns true only if both variables refer to the exact same object in memory. 
// It does not compare the content of the objects.

// String s1 = new String("hello");
// String s2 = new String("hello");
// boolean result = (s1 == s2); // result will be false (different objects, same content)

// String s3 = "world";
// String s4 = "world";
// boolean result2 = (s3 == s4); // result2 will be true (String literal pool optimization)


// 2. equals() Method:
// Objects: The equals() method is a method defined in the Object class and can be overridden by subclasses.
// Its primary purpose is to compare the content or state of two objects for logical equality.

// Default Behavior: In the Object class, the default implementation of equals() behaves the same as ==, 
// comparing references.
// Overridden Behavior: Many classes in Java (like String, Integer, Date, etc.) override equals() 
// to provide a meaningful comparison of their content. For example, String.equals() 
// compares the sequence of characters in two String objects.

// String s1 = new String("hello");
// String s2 = new String("hello");
// boolean result = s1.equals(s2); // result will be true (content is the same)

// Primitives: The equals() method cannot be directly used with primitive types. 
// You would use == for comparing primitive values.


public class _131_comparisionOperator_vs_equals {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Using '==' operator
        if (str1 == str2) {
            System.out.println("'==' operator: Both references point to the same object.");
        } else {
            System.out.println("'==' operator: References point to different objects.");
        }

        // Using 'equals()' method
        if (str1.equals(str2)) {
            System.out.println("'equals()' method: Both strings have the same content.");
        } else {
            System.out.println("'equals()' method: Strings have different content.");
        }
    }
}

// In Summary:
// Use == to compare primitive values or to check if two object references point to the exact same 
// object in memory.

// Use equals() to compare the content or logical equality of two objects. 
// Always consider overriding equals() in your custom classes if you need to define a specific way to
// compare their content.