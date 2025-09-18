// In Java, an array is a data structure used to store a fixed number of elements 
// of the same type. Arrays are widely used for organizing and managing collections 
// of data efficiently.

// Characteristics of Arrays
// Fixed Size:
// Once declared, the size of an array cannot be changed.

// Same Data Type:
// All elements in an array must be of the same type (e.g., all integers or all 
// strings).

// Zero-Based Indexing:
// Array indexing starts at 0 and ends at length - 1.

// Stored in Contiguous Memory Locations:
// Elements are stored sequentially in memory.

//For array of objects
class Student
{
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    //Getter methods
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class _09_arrays {
    public static void main(String[] args) {
        
        // Declaring Arrays:
        // To declare an array in Java, you must specify the type of elements and 
        // the number of elements the array can hold. 

        // The syntax for declaring an array is as follows:
        // dataType[] arrayName;
        // or
        // dataType arrayName[];
        //Example:
        int[] numbers;
        // or
        int numbers2[];


        // Initializing Arrays:
        // To initialize an array in Java, you must allocate memory for the array
        // and specify the values of the elements.
        
        // The syntax for initializing an array is as follows:
        // dataType[] arrayName = new dataType[]{element1, element2, ..., elementN};
        // or
        // dataType[] arrayName = {element1, element2, ..., elementN};
        //Example:
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};
        // or
        int[] numbers4 = {1, 2, 3, 4, 5};


        // Accessing Array Elements:
        // You can access elements in an array using the index of the element.
        // The index of the first element is 0, the index of the second element is 1,
        // and so on.

        // The syntax for accessing an element in an array is as follows:
        // arrayName[index];
        //Example:
        int[] numbers5 = {1, 2, 3, 4, 5};
        System.out.println(numbers5[0]); // Output: 1
        System.out.println(numbers5[1]); // Output: 2
        System.out.println(numbers5[2]); // Output: 3
        System.out.println(numbers5[3]); // Output: 4
        System.out.println(numbers5[4]); // Output: 5


        // Changing Array Elements:
        // You can change the value of an element in an array by assigning a new value
        // to the element using the index of the element.

        // The syntax for changing an element in an array is as follows:
        // arrayName[index] = newValue;
        //Example:
        int[] numbers6 = {1, 2, 3, 4, 5};
        numbers6[0] = 10;
        System.out.println(numbers6[0]); // Output: 10
        
        // Iterating Over Arrays:
        // You can iterate over the elements in an array using a for loop.
        // The loop variable is used as the index to access each element in the array.

        // The syntax for iterating over an array is as follows:
        // for (int i = 0; i < arrayName.length; i++) {
        //     // Access the element at index i
        //     arrayName[i];
        // }
        //Example:
        int[] numbers7 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers7.length; i++) {
            System.out.println(numbers7[i]);
        }
        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5



        // Multidimensional Arrays:
        // In Java, you can create multidimensional arrays, which are arrays of arrays.
        // A two-dimensional array is an array of arrays, where each element is itself
        // an array.

        // The syntax for declaring a two-dimensional array is as follows:
        // dataType[][] arrayName;
        // or
        // dataType arrayName[][];
        //Example:
        int[][] matrix;
        // or
        int matrix2[][];

        // Initializing a Two-Dimensional Array:
        // To initialize a two-dimensional array in Java, you must allocate memory for
        // the array and specify the values of the elements.

        // The syntax for initializing a two-dimensional array is as follows:
        // dataType[][] arrayName = new dataType[rowSize][columnSize];
        //Example:
        int[][] matrix3 = new int[2][3];

        // Accessing Elements in a Two-Dimensional Array:
        // You can access elements in a two-dimensional array using the row and column
        // indices of the element.

        // The syntax for accessing an element in a two-dimensional array is as follows:
        // arrayName[rowIndex][columnIndex];
        //Example:
        int[][] matrix4 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix4[0][0]); // Output: 1
        System.out.println(matrix4[0][1]); // Output: 2
        System.out.println(matrix4[0][2]); // Output: 3
        System.out.println(matrix4[1][0]); // Output: 4
        System.out.println(matrix4[1][1]); // Output: 5
        System.out.println(matrix4[1][2]); // Output: 6
        
        // Changing Elements in a Two-Dimensional Array:
        // You can change the value of an element in a two-dimensional array by assigning
        // a new value to the element using the row and column indices of the element.

        // The syntax for changing an element in a two-dimensional array is as follows:
        // arrayName[rowIndex][columnIndex] = newValue;
        //Example:
        int[][] matrix5 = {{1, 2, 3}, {4, 5, 6}};
        matrix5[0][0] = 10;
        System.out.println(matrix5[0][0]); // Output: 10
        
        // Iterating Over Elements in a Two-Dimensional Array:
        // You can iterate over the elements in a two-dimensional array using nested for loops.
        // The outer loop iterates over the rows, and the inner loop iterates over the columns.

        // The syntax for iterating over a two-dimensional array is as follows:
        // for (int i = 0; i < arrayName.length; i++) {
        //     for (int j = 0; j < arrayName[i].length; j++) {
        //         // Access the element at row i and column j
        //         arrayName[i][j];
        //     }

        //Example:
        int[][] matrix6 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                System.out.println(matrix6[i][j]);
            }
        }
        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6

        //Jagged array
        // A jagged array is an array of arrays where the inner arrays can have different lengths.
        int [][] arr = new int[3][];  //Jagged array with 3 rows
        arr[0] = new int[3];  // First row has 3 elements
        arr[1] = new int[2];  // Second row has 2 elements
        arr[2] = new int[4];  // Third row has 4 elements


        // Arrays of Objects:
        // In Java, you can create arrays of objects. Each element in the array is a reference
        // to an object of the specified type.

        // The syntax for declaring an array of objects is as follows:
        // ClassName[] arrayName;
        // or
        // ClassName arrayName[];
        //Example:
        Student[] names;
        // or
        Student names2[];

        // Initializing an Array of Objects:
        // To initialize an array of objects in Java, you must allocate memory for the array
        // and create new objects to store in the array.

        // The syntax for initializing an array of objects is as follows:
        // ClassName[] arrayName = new ClassName[size];
        //Example:
        Student[] names3 = new Student[3];

        // Accessing Elements in an Array of Objects:
        // You can access elements in an array of objects using the index of the element.

        // The syntax for accessing an element in an array of objects is as follows:
        // arrayName[index];
        //Example:
        Student[] student = new Student[3];
        student[0] = new Student(1, "Alice", 20);
        student[1] = new Student(2, "Bob", 21);
        student[2] = new Student(3, "Charlie", 22);

        // Changing Elements in an Array of Objects:
        // You can change the value of an element in an array of objects by assigning a new
        // object to the element using the index of the element.

        // The syntax for changing an element in an array of objects is as follows:
        //Example:
        student[0].setName("David");
        System.out.println(student[0].getName()); // Output: David

        // Iterating Over Elements in an Array of Objects:
        // You can iterate over the elements in an array of objects using a for loop.
        // The loop variable is used as the index to access each element in the array.

        // The syntax for iterating over an array of objects is as follows:
        // for (int i = 0; i < arrayName.length; i++) {
        //     // Access the element at index i
        //     arrayName[i];
        // }
        //Example:
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getName());
        }
        //Enhanced for loop
        for(Student s : student){
            System.out.println(s.getName());
        }
        // Output:
        // David
        // Bob
        // Charlie


    }
}
