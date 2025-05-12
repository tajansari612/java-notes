import java.util.HashSet;

// Definition:
// HashSet is a collection that does not allow duplicate elements.
// It is part of the Java Collections Framework and implements the Set interface.
// HashSet is not synchronized, which means it is not thread-safe.
// HashSet is not ordered, which means the elements are not stored in any particular order.
// HashSet allows null values, but only one null value is allowed.
// HashSet is implemented using a hash table, which means it uses a hash function to compute the index of the element in the table.

// Time Complexity:
// 1. add() - O(1) on average
// 2. remove() - O(1) on average
// 3. contains() - O(1) on average   // searching for an element


public class _02_HashSet {
    public static void main(String[] args) {
        // Creation of HashSet:
        // HashSet<type> setName = new HashSet<>();
        HashSet<Integer> setInt = new HashSet<>();   //set of integers
        HashSet<Float> setFl = new HashSet<>();   //set of floats
        HashSet<String> setStr = new HashSet<>();   //set of Strings
        HashSet<Character> setChar = new HashSet<>();   //set of characters
        HashSet<Boolean> setBool = new HashSet<>();   //set of Booleans
        HashSet<Object> setObj = new HashSet<>();   //set of objects

        // HashSet methods:
        // 1. add(value) - adds an element to the set   
        // 2. remove(value) - removes an element from the set
        // 3. contains(value) - checks if the set contains an element
        // 4. size() - gets the size of the set
        // 5. clear() - clears the set
        // 6. isEmpty() - checks if the set is empty
        // 7. iterator() - gets an iterator for the set
        // 8. forEach() - iterates over the set
        // 9. toArray() - converts the set to an array
        // 10. toString() - converts the set to a string
        // 11. clone() - clones the set


        // 1. Adding elements to the set:
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(1);
        setInt.add(4);
        setInt.add(9);
        setInt.add(7);
        setInt.add(5);
        System.out.println(setInt);

        // 2. Removing elements from the set:
        setInt.remove(2);
        System.out.println(setInt);

        // 3. Checking if the set contains an element:
        System.out.println(setInt.contains(1));

        // 4. Getting the size of the set:
        System.out.println(setInt.size());

        // 5. Clearing the set:
        setInt.clear();
        System.out.println(setInt);

        // 6. Checking if the set is empty:
        System.out.println(setInt.isEmpty());

        // 7. Adding elements to the set again:
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);
        setInt.add(6);
        setInt.add(7);
        setInt.add(8);
        System.out.println(setInt);

        // 8. Iterating over the set:
        for (Integer i : setInt) {
            System.out.print(i + " ");
        }System.out.println();

        // 9. Using forEach to iterate over the set:
        setInt.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 10. Using iterator to iterate over the set:
        var iterator = setInt.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }System.out.println();

        // 11. Converting the set to an array:
        Object[] arr = setInt.toArray();
        for (Object i : arr) {
            System.out.print(i + " ");
        }System.out.println();

        // 12. Converting the set to a string:
        System.out.println(setInt.toString());

        // 13. Cloning the set:
        HashSet<Integer> setIntClone = (HashSet<Integer>) setInt.clone();
        System.out.println(setIntClone);


    }
}
