public class _06_conditionals {
    public static void main(String[] args) {
        // Conditional statements are used to perform different actions based 
        // on different conditions.
        // In Java, we have the following conditional statements:
        // - if statement
        // - if...else statement
        // - if...else if...else statement
        // - switch statement

        // If statement
        // The if statement executes a block of code if a specified condition 
        // is true.
        // Syntax:
        // if (condition) {
        //     // block of code to be executed if the condition is true
        // }
        int x = 20;
        if (x > 10) {
            System.out.println("x is greater than 10");
        }

        // If...else statement
        // The if...else statement executes a block of code if a specified 
        // condition is true and another block of code if it is false.
        // Syntax:
        // if (condition) {
        //     // block of code to be executed if the condition is true
        // } else {
        //     // block of code to be executed if the condition is false
        // }
        int y = 5;
        if (y > 10) {
            System.out.println("y is greater than 10");
        } else {
            System.out.println("y is less than or equal to 10");
        }

        // If...else if...else statement
        // The if...else if...else statement executes different codes for more than two conditions.
        // Syntax:
        // if (condition1) {
        //     // block of code to be executed if condition1 is true
        // } else if (condition2) {
        //     // block of code to be executed if the condition1 is false and condition2 is true
        // } else {
        //     // block of code to be executed if the condition1 is false and condition2 is false
        // }
        int z = 30;
        if (z < 10) {
            System.out.println("z is less than 10");
        } else if (z < 20) {
            System.out.println("z is less than 20");
        } else {
            System.out.println("z is greater than or equal to 20");
        }

        //switch statement
        // The switch statement is used to perform different actions based on 
        // different conditions.
        // Syntax:
        // switch (expression) {
        //     case value1:
        //         // code block
        //         break;
        //     case value2:
        //         // code block
        //         break;
        //     ...
        //     default:
        //         // code block
        // }
        // The switch expression is evaluated once.
        // The value of the expression is compared with the values of each case.
        // If there is a match, the associated block of code is executed.
        // If there is no match, the default block is executed.
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
