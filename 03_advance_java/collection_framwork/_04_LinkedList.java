import java.util.Iterator;
import java.util.LinkedList;

//Definition of LinkedList:
// A linked list is a linear data structure where each element is a separate object.
// Each element (node) of a list is comprising of two items - the data and a 
// reference to the next node.
// The last node has a reference to null.
public class _04_LinkedList {
    public static void main(String[] args) {

        // LinkedList creation:
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        System.out.println(ll1.get(0));
        System.out.println(ll1.get(1));
        System.out.println(ll1.get(2));

        //LinkedList Methods:
        // addFirst(data) - Adds an item to the beginning of the list
        ll1.addFirst(0);

        // addLast(data) - Adds an item to the end of the list
        ll1.addLast(4);

        // removeFirst() - Removes the first item from the list
        ll1.removeFirst();

        // removeLast() - Removes the last item from the list
        ll1.removeLast();

        // getFirst() - Returns the first item from the list
        System.out.println(ll1.getFirst());

        // getLast() - Returns the last item from the list
        System.out.println(ll1.getLast());

        // size() - Returns the number of items in the list
        System.out.println(ll1.size());

        // clear() - Removes all items from the list
        ll1.clear();

        // isEmpty() - Returns true if the list is empty
        System.out.println(ll1.isEmpty());

        // contains() - Returns true if the list contains the specified item
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        System.out.println(ll1.contains(2));

        // indexOf() - Returns the index of the first occurrence of the specified item
        System.out.println(ll1.indexOf(2));

        // lastIndexOf() - Returns the index of the last occurrence of the specified item
        System.out.println(ll1.lastIndexOf(2));

        // toArray() - Returns an array containing all items in the list
        Object[] arr = ll1.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }
        // toString() - Returns a string representation of the list
        System.out.println(ll1.toString());

        // clone() - Returns a shallow copy of the list
        LinkedList<Integer> ll2 = (LinkedList<Integer>) ll1.clone();

        // addAll() - Adds all items from the specified collection to the list
        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(4);
        ll3.add(5);
        ll3.add(6);
        ll1.addAll(ll3);

        // removeAll() - Removes all items from the specified collection from the list
        ll1.removeAll(ll3);

        // retainAll() - Retains only the items in the list that are contained in the specified collection
        ll1.retainAll(ll3);

        //for loop - Iterates through the list
        for(int i = 0; i < ll1.size(); i++) {
            System.out.println(ll1.get(i));
        }
        // for loop with enhanced for loop - Iterates through the list
        for(Integer item : ll1) {
            System.out.println(item);
        }

        Iterator<Integer> iterator = ll1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach() - Performs the given action for each item in the list
        ll1.forEach(item -> {
            System.out.println(item);
        });

    }
}
