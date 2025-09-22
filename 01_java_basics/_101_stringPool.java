
// The String Constant Pool (SCP), also known as the String Pool or String Intern Pool, 
// is a special storage area within the Java Heap memory. It is a mechanism used by 
// the Java Virtual Machine (JVM) to optimize memory usage and improve performance 
// by storing and reusing string literals.


// Here's how it works:
// Storage of String Literals: When a string literal (e.g., "hello") is encountered in Java code, 
// the JVM first checks if an identical string already exists in the String Constant Pool.

// Reusing Existing Strings: If the string literal is already present in the pool, 
// the JVM does not create a new String object. Instead, it returns a reference 
// to the existing String object in the pool. This process is called "interning."

// Adding New Strings: If the string literal is not found in the pool, a new String object is created 
// in the heap, and a copy of this object is then added to the String Constant Pool. 
// The reference to this new object is then returned.

// new String() vs. String Literals:
// String Literals: When you declare a string using a literal (e.g., String s = "example";), 
// the JVM will automatically check the SCP and either reuse an existing object or create a new one 
// in the pool.

// new String(): When you create a string using the new keyword (e.g., String s = new String("example");), 
// a new String object is always created in the general heap memory, regardless of whether an identical 
// string exists in the SCP. You can explicitly add this new String object to the SCP using 
// the intern() method.


// Benefits of the String Constant Pool:
// Memory Optimization: By reusing identical string literals, the SCP significantly reduces the number 
// of String objects created in the JVM, leading to lower memory consumption.

// Performance Enhancement: Reusing existing string objects rather than creating new ones can improve 
// application performance, especially in scenarios with frequent string manipulations.

// Thread Safety: Since String objects are immutable in Java, and the SCP stores these immutable objects, 
// they are inherently thread-safe, allowing multiple threads to share and access them without concurrency 
// issues.

public class _101_stringPool{
    public static void main(String[] args){
        String s1 = "example";
        String s2 = "example";

        System.out.println(s1 == s2); // true, both refer to the same object in SCP
        System.out.println(s1.equals(s2)); // true, both have the same content

        String s3 = new String("example");
        System.out.println(s1 == s3); // false, s3 refers to a different object in heap
        System.out.println(s1.equals(s3)); // true, both have the same content
        String s4 = s3.intern(); // Adds s3 to SCP if not already present

        System.out.println(s1 == s4); // true, both refer to the same object in SCP
        System.out.println(s1.equals(s4)); // true, both have the same content

        
    }
}