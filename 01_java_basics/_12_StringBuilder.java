public class _12_StringBuilder {
    public static void main(String[] args) {
        // StringBuilder
        // The StringBuilder in Java represents a mutable sequence of characters. Since
        // the String Class in Java creates an immutable sequence of characters, the
        // StringBuilder class provides an alternative to String Class, as it creates a
        // mutable sequence of characters.
        // The function of StringBuilder is very much similar to the StringBuffer class,
        // as both of them provide an alternative to String Class by making it mutable.
        // However, the StringBuilder class is preferred over StringBuffer for
        // non-threaded applications (single-threaded applications) as it is faster than
        // StringBuffer.
        // Example:
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Output: Hello

        // The StringBuilder class is available since JDK 1.5.
        // The StringBuilder class is not synchronized, so it is not thread-safe.
        // If you are working in a multithreaded environment, where the method is being
        // accessed by multiple threads, you should use StringBuffer class.
        // The StringBuilder class is faster than StringBuffer because it is not
        // synchronized.
        // The StringBuilder class is more efficient than StringBuffer when we are working
        // in a single-threaded environment.
        // The StringBuilder class is used when a large amount of string manipulation is
        // required.
        // The StringBuilder class is used in the case where a string is to be modified
        // frequently.
        // The StringBuilder class is used when the length of the Java String is
        // expected to change frequently.
        // The StringBuilder class is used when the Java String operations are
        // performance-sensitive.
        // The StringBuilder class is used when the Java String operations are
        // memory-sensitive.
        
        // StringBuilder Methods
        // The StringBuilder class provides many methods to work with the string. Some of
        // the commonly used methods of the StringBuilder class are:
        
        // append(): It is used to add text at the end of the existing text.
        // Example:
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2); // Output: Hello World

        
        //setCharAt(): It is used to replace the character at a specific position in the
        // existing text.
        // Example:
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.setCharAt(1, 'i');
        System.out.println(sb1); // Output: Hillo


        // capacity(): It is used to return the current capacity of the StringBuilder
        // object.
        // Example:
        StringBuilder sb7 = new StringBuilder("Hello");
        System.out.println(sb7.capacity()); // Output: 21


        // length(): It is used to return the length of the StringBuilder object.
        // Example:
        StringBuilder sb8 = new StringBuilder("Hello");
        System.out.println(sb8.length()); // Output: 5
        

        //replace(): It is used to replace the text from the existing text.
        // Example:
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.replace(1, 3, "i");
        System.out.println(sb4); // Output: Hilo


        // substring(): It is used to return the substring of the StringBuilder object.
        // Example:
        StringBuilder sb9 = new StringBuilder("Hello");
        System.out.println(sb9.substring(1, 3)); // Output: el


        // insert(): It is used to add text at a specific position in the existing text.
        // Example:
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.insert(1, "i");
        System.out.println(sb3); // Output: Hiello


        // delete(): It is used to delete the text from the existing text.
        // Example:
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.delete(1, 3);
        System.out.println(sb5); // Output: Hlo


        // reverse(): It is used to reverse the existing text.
        // Example:
        StringBuilder sb6 = new StringBuilder("Hello");
        sb6.reverse();
        System.out.println(sb6); // Output: olleH


        // toString(): It is used to convert the StringBuilder object to a String object.
        // Example:
        StringBuilder sb10 = new StringBuilder("Hello");
        String str = sb10.toString();
        System.out.println(str); // Output: Hello
        
    }
}
