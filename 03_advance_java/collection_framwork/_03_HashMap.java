import java.util.HashMap;


public class _03_HashMap {
    public static void main(String[] args) {
        // Creation of HashMap:
        // HashMap<keyType, valueType> mapName = new HashMap<>();
        HashMap<Integer, String> mapIntStr = new HashMap<>();   //map of integers to strings
        HashMap<String, Integer> mapStrInt = new HashMap<>();   //map of strings to integers
        HashMap<String, String> mapStrStr = new HashMap<>();   //map of strings to strings
        HashMap<Integer, Integer> mapIntInt = new HashMap<>();   //map of integers to integers
        HashMap<Character, Integer> mapCharInt = new HashMap<>();   //map of characters to integers

        // HashMap methods:
        // 1. put(key, value) - adds a key-value pair to the map
        // 2. get(key) - gets the value for a key in the map
        // 3. remove(key) - removes a key-value pair from the map
        // 4. containsKey(key) - checks if the map contains a key
        // 5. containsValue(value) - checks if the map contains a value
        // 6. size() - gets the size of the map
        // 7. clear() - clears the map
        // 8. isEmpty() - checks if the map is empty
        // 9. keySet() - gets a set of keys in the map
        // 10. values() - gets a collection of values in the map
        // 11. entrySet() - gets a set of key-value pairs in the map


        // 1. Adding key-value pairs to the map:
        mapCharInt.put('a', 1);
        mapCharInt.put('b', 2);
        mapCharInt.put('c', 3);
        mapCharInt.put('d', 4);
        mapCharInt.put('e', 5);
        System.out.println(mapCharInt);

        // 2. Getting the value for a key in the map:
        System.out.print(mapCharInt.get('a')+" ");
        System.out.print(mapCharInt.get('b')+" ");
        System.out.print(mapCharInt.get('c')+" ");
        System.out.print(mapCharInt.get('d')+" ");
        System.out.print(mapCharInt.get('e')+" ");
        System.out.println(mapCharInt.get('f')); // returns null if key is not found

        // 3. Removing a key-value pair from the map:
        mapCharInt.remove('a');
        System.out.println(mapCharInt);

        // 4. Checking if the map contains a key:
        System.out.print(mapCharInt.containsKey('a')+" "); // returns false
        System.out.print(mapCharInt.containsKey('b')+" "); // returns true
        System.out.print(mapCharInt.containsKey('c')+" "); // returns true
        System.out.print(mapCharInt.containsKey('d')+" "); // returns true
        System.out.print(mapCharInt.containsKey('e')+" "); // returns true
        System.out.println(mapCharInt.containsKey('f')); // returns false

        // 5. Checking if the map contains a value:
        System.out.print(mapCharInt.containsValue(1)+" "); // returns false
        System.out.print(mapCharInt.containsValue(2)+" "); // returns true
        System.out.print(mapCharInt.containsValue(3)+" "); // returns true
        System.out.print(mapCharInt.containsValue(4)+" "); // returns true
        System.out.print(mapCharInt.containsValue(5)+" "); // returns true
        System.out.println(mapCharInt.containsValue(6)); // returns false

        // 6. Getting the size of the map:
        System.out.println(mapCharInt.size()); // returns 4
        
        // 7. Clearing the map:
        mapCharInt.clear();
        System.out.println(mapCharInt); // returns {}

        // 8. Checking if the map is empty:
        System.out.println(mapCharInt.isEmpty()); // returns true

        // 9. Adding key-value pairs to the map again:
        mapCharInt.put('a', 1);
        mapCharInt.put('b', 2);
        mapCharInt.put('c', 3);
        mapCharInt.put('d', 4);
        mapCharInt.put('e', 5);
        System.out.println(mapCharInt); // returns {a=1, b=2, c=3, d=4, e=5}

        // 10. Getting a set of keys in the map:
        System.out.println(mapCharInt.keySet()); // returns [a, b, c, d, e]

        // 11. Getting a collection of values in the map:
        System.out.println(mapCharInt.values()); // returns [1, 2, 3, 4, 5]

        // 12. Iterating over the map:
        for (Character key : mapCharInt.keySet()) {
            System.out.print(key + " " + mapCharInt.get(key) + " ");
        }System.out.println();

        // 13. Using forEach to iterate over the map:
        mapCharInt.forEach((key, value) -> System.out.print(key + " " + value + " "));
        System.out.println();

        // 14. Using iterator to iterate over the map:
        var iterator = mapCharInt.keySet().iterator();
        while (iterator.hasNext()) {
            var key = iterator.next();
            System.out.print(key + " " + mapCharInt.get(key) + " ");
        }System.out.println();


    }
}
