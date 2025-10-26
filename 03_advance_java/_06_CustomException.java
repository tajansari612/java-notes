// Custom Exception class

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message){
        super(message);
    }
    
}
public class _06_CustomException {
    public static void main(String[] args) {
        //Driving licence
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        try {
            if(age<=18){
                throw new InvalidAgeException("Invalid Age must be greater than 18 ");
            }
            System.out.println("Age is valid");
        } catch (InvalidAgeException e) {
            // TODO: handle exception
            System.out.println("Error: "+e.getMessage());
        }
    }

    // Method to check age
    
}