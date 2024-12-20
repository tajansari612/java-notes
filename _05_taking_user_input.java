// In Java, we use the Scanner class to take user input.
// To use the Scanner class, create an object of the class and 
// use any of the available methods found in the Scanner class 
// documentation.
// Here’s an example:

// Import the Scanner class
import java.util.Scanner;

public class _05_taking_user_input {
    public static void main(String[] args) {

        // Create an object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        // String s1 = sc.next();   // Reads a single word
        // String s2 = sc.nextLine();   // Reads a full line
        // int x = sc.nextInt();   // Reads an integer
        // float y = sc.nextFloat();   // Reads a float
        // double z = sc.nextDouble();   // Reads a double

        // Example:
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);

        // Close the Scanner object
        sc.close();


    }
}
