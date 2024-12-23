// In Java, strings are objects that represent a sequence of characters. 
// The String class in Java is used to create and manipulate strings. 
// Strings are immutable, meaning their value cannot be changed once created.

// Key Characteristics of Strings:
// Immutable:
// Once a String object is created, it cannot be modified.
// Any operation that modifies a string creates a new String object.

// Stored in String Pool:
// Java uses a special memory location called the "String Pool" to manage strings 
// efficiently.

// Backed by the String Class:
// The String class is part of java.lang and provides various methods for string 
// manipulation.

import java.util.Scanner;
public class _10_strings {
    public static void main(String[] args) {
        // Creating Strings
        // You can create strings in Java using the following methods:
        // 1. Using String Literals:
        // String literals are sequences of characters enclosed in double quotes.
        // Example:
        String str1 = "Hello, World!";
        // 2. Using the new Keyword:
        // You can also create strings using the new keyword and the String class
        // constructor.
        // Example:
        String str2 = new String("Hello, World!");

        
        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();    // next() reads the next string(single word) of input
        String input2 = sc.nextLine();    // nextLine() reads the next line(all words) of input
        System.out.println("You entered: " + input);
        System.out.println("You entered: " + input2);


        // Concatenating Strings
        // You can concatenate strings in Java using the + operator.
        // Example:
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Output: John Doe

        // String Length
        // You can get the length of a string in Java using the length() method.
        // Example:
        String str3 = "Hello, World!";
        int length = str3.length();
        System.out.println(length); // Output: 13

        // Accessing Characters
        // You can access individual characters in a string using the charAt() method.
        // The index of the first character is 0, the index of the second character is 1,
        // and so on.
        // Example:
        String str4 = "Hello, World!";
        char firstChar = str4.charAt(0);
        System.out.println(firstChar); // Output: H

        // Substrings
        // You can extract substrings from a string using the substring() method.
        // The substring() method takes two arguments: the starting index and the ending
        // index (exclusive).
        // Example:
        String str5 = "Hello, World!";
        String subStr = str5.substring(7, 12);
        System.out.println(subStr); // Output: World

        // String Comparison
        // You can compare strings in Java using the equals() method.
        // The equals() method returns true if the strings are equal and false otherwise.
        // Example:
        String str6 = "Hello";
        String str7 = "Hello";
        String str66 = new String("Hello");
        String str77 = new String("Hello");
        System.out.println(str6==str7); // Output: true
        System.out.println(str66==str77); // Output: false
        System.out.println(str6.equals(str7)); // Output: true
        System.out.println(str66.equals(str77)); // Output: true
        //Note: Hence always use str1.equals(str2)
        // The reason str1==str2 becomes false is that strins in java are objects 

        // String Formatting
        // You can format strings in Java using the format() method of the String class.
        // The format() method takes a format string and arguments and returns a formatted
        // string.
        // Example:
        String name = "John";
        int age = 30;
        String message = String.format("Hello, %s. You are %d years old.", name, age);
        System.out.println(message); // Output: Hello, John. You are 30 years old.

        // String Methods
        // The String class in Java provides various methods for string manipulation.
        // Here are some common methods:
        // 1. toUpperCase(): Converts the string to uppercase.
        // 2. toLowerCase(): Converts the string to lowercase.
        // 3. trim(): Removes leading and trailing whitespace.
        // 4. replace(): Replaces characters in the string.
        // 5. split(): Splits the string into an array of substrings.
        // 6. indexOf(): Returns the index of a character or substring.
        // 7. contains(): Checks if the string contains a substring.
        // 8. startsWith(): Checks if the string starts with a substring.
        // 9. endsWith(): Checks if the string ends with a substring.
        // 10. isEmpty(): Checks if the string is empty.
        // 11. length(): Returns the length of the string.
        // 12. charAt(): Returns the character at a specific index.
        // 13. substring(): Returns a substring of the string.
        // 14. equals(): Compares two strings for equality.
        // 15. format(): Formats the string using a format string and arguments.
        // 16. valueOf(): Converts a value to a string.
        // 17. intern(): Returns the canonical representation of the string.
        // 18. compareTo(): Compares two strings lexicographically.
        // 19. concat(): Concatenates two strings.
        // 20. join(): Joins multiple strings with a delimiter.
        // 21. repeat(): Repeats the string a specified number of times.
        // 22. codePointAt(): Returns the Unicode code point at a specific index.
        // 23. codePointBefore(): Returns the Unicode code point before a specific index.
        // 24. codePointCount(): Returns the number of Unicode code points in the string.
        // 25. offsetByCodePoints(): Returns the index of a code point offset from a specific index.
        // 26. getChars(): Copies characters from the string to a character array.
        // 27. equalsIgnoreCase(): Compares two strings ignoring case differences.
        // 28. contentEquals(): Compares the content of the string with a character sequence.
        // 29. contentEquals(): Compares the content of the string with a string buffer.
        // 30. matches(): Checks if the string matches a regular expression.
        // 31. regionMatches(): Checks if a region of the string matches a region of another string.
        // 32. replaceFirst(): Replaces the first occurrence of a substring in the string.
        // 33. replaceAll(): Replaces all occurrences of a substring in the string.
        // 34. toCharArray(): Converts the string to a character array.
        // 35. getBytes(): Encodes the string into a byte array using a specified charset.
        // 36. getBytes(): Encodes the string into a byte array using the platform's default charset.
        // 37. toCharArray(): Converts the string to a character array.
        // 38. getChars(): Copies characters from the string to a character array.
        // 39. offsetByCodePoints(): Returns the index of a code point offset from a specific index.
        // 40. codePointAt(): Returns the Unicode code point at a specific index.
        // 41. codePointBefore(): Returns the Unicode code point before a specific index.
        // 42. codePointCount(): Returns the number of Unicode code points in the string.
        // 43. codePoints(): Returns a stream of Unicode code points from the string.
        // 44. compareTo(): Compares two strings lexicographically.
        // 45. compareToIgnoreCase(): Compares two strings lexicographically ignoring case differences.
        // 46. concat(): Concatenates two strings.
        // 47. contains(): Checks if the string contains a sequence of characters.

        // Example:
        String str8 = "Hello, World!";
        System.out.println(str8.toUpperCase()); // Output: HELLO, WORLD!
        System.out.println(str8.toLowerCase()); // Output: hello, world!
        System.out.println(str8.trim()); // Output: Hello, World!
        System.out.println(str8.replace("Hello", "Hi")); // Output: Hi, World!
        System.out.println(str8.split(",")[0]); // Output: Hello
        System.out.println(str8.indexOf("World")); // Output: 7
        System.out.println(str8.contains("World")); // Output: true
        System.out.println(str8.startsWith("Hello")); // Output: true
        System.out.println(str8.endsWith("World!")); // Output: true
        System.out.println(str8.isEmpty()); // Output: false
        System.out.println(str8.length()); // Output: 13
        System.out.println(str8.charAt(0)); // Output: H

    }
}
