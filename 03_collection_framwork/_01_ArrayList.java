import java.util.ArrayList;
import java.util.Collections;

//ArrayList properties:
// 1. Dynamic size
// 2. Stored in non-contiguous memory
// 3. Can store any type of object
//    3.1 Can store primitive data types (int, float, char, boolean) as wrapper 
//    classes (Integer, Float, Character, Boolean)
// 4. Can store duplicate values
// 5. Can store null values (we can't store null values in primitive 
// data types(in array))

// Time Complexity:
// 1. add() - O(1) on average
// 2. remove() - O(n) on average
// 3. get() - O(1) on average
// 4. set() - O(1) on average
// 5. contains() - O(n) on average   //Search in the list


class _01_ArrayList{
    public static void main(String[] args) {
        // Creation of ArrayList:
        // ArrayList<type> listName = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();   //list of integers
        ArrayList<Float> listFl = new ArrayList<>();   //list of floats
        ArrayList<String> listStr = new ArrayList<>();   //list of Strings
        ArrayList<Character> listChar = new ArrayList<>();   //list of characters
        ArrayList<Boolean> listBool = new ArrayList<>();   //list of Booleans
        ArrayList<Object> listObj = new ArrayList<>();   //list of objects


        //ArrayList methods:
        // 1. add(value) - adds an element to the list
            // 1.2 add(value, index) - adds an element to the list at a specific index
        // 2. remove(index) - removes an element from the list
        // 3. get(index) - gets an element from the list
        // 4. set(index, value) - sets an element in the list
        // 5. size() - gets the size of the list
        // 6. clear() - clears the list
        // 7. isEmpty() - checks if the list is empty
        // 8. contains(value) - checks if the list contains an element
        // 9. indexOf(value) - gets the index of an element in the list
        // 10. lastIndexOf(value) - gets the last index of an element in the list
        // 11. toArray() - converts the list to an array
        // 12. forEach() - iterates over the list
        // 13. sort() - sorts the list
        // 14. subList() - gets a sublist of the list
        // 15. trimToSize() - trims the size of the list
        // 16. ensureCapacity() - ensures the capacity of the list
        // 17. toString() - converts the list to a string
        // 18. clone() - clones the list
        // 19. iterator() - gets an iterator for the list
        // 20. listIterator() - gets a list iterator for the list

        //1. add(value)
        System.out.println("-----------------1. add(value) ----------------------------");
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        //2. remove(index)
        System.out.println("-----------------2. remove(index) ----------------------------");
        l1.remove(1);      // remove the element at index 1
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        //3. get(index)
        System.out.println("-----------------3. get(index) ----------------------------");
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        //4. set(index, value)
        System.out.println("-----------------4. set(index, value) ----------------------------");
        l1.set(1, 4);
        System.out.println(l1.get(1));

        //5. size()
        System.out.println("-----------------5. size() ----------------------------");
        System.out.println(l1.size());

        //6. for loop
        System.out.println("-----------------6. for loop ----------------------------");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //7. iterator()
        System.out.println("-----------------7. iterator() ----------------------------");
        Iterator<Integer> it = l2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //8. sort()
        System.out.println("-----------------8. sort() ----------------------------");
        Collections.sort(l1);   // sort the list
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());   // sort the list in reverse order
        System.out.println(l1);

        //9. clear()
        System.out.println("-----------------9. clear() ----------------------------");
        l1.clear();
        System.out.println(l1.size());

        //10. isEmpty()
        System.out.println("-----------------10. isEmpty() ----------------------------");
        System.out.println(l1.isEmpty());
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1.isEmpty());

        //11. contains(value)
        System.out.println("-----------------11. contains(value) ----------------------------");
        System.out.println(l1.contains(1));
        System.out.println(l1.contains(4));

        //12. indexOf(value)
        System.out.println("-----------------12. indexOf(value) ----------------------------");
        System.out.println(l1.indexOf(1));
        System.out.println(l1.indexOf(4));

        //13. lastIndexOf(value)
        System.out.println("-----------------13. lastIndexOf(value) ----------------------------");
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);
        System.out.println(l1.lastIndexOf(1));
        System.out.println(l1.lastIndexOf(4));

        //14. toArray()
        System.out.println("-----------------14. toArray() ----------------------------");
        Object[] arr = l1.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //15. subList()
        System.out.println("-----------------15. subList() ----------------------------");
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3 = (ArrayList<Integer>) l2.subList(1, 4);   // get the sublist from index 1 to 4
        System.out.println(l3);

        //16. toString()
        System.out.println("-----------------16. toString() ----------------------------");
        System.out.println(l2.toString());

        //17. clone()
        System.out.println("-----------------17. clone() ----------------------------");
        ArrayList<Integer> l4 = (ArrayList<Integer>) l2.clone();
        System.out.println(l4);

    }
}