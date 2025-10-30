
// The Stream API in Java (introduced in Java 8) provides a functional approach to processing
// sequences of elements (like collections).
// It allows you to perform operations such as filtering, mapping, and reducing data
// in a declarative way.

//Benefits:
//Concise and readable code using functional-style operations.
//Supports parallel processing for better performance.
//No modification of the original data source.
//Lazy evaluation for efficient computation.

import java.util.List;
import java.util.stream.*;
import java.util.Arrays;

public class _11_StreamApi {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(5, 3, 6, 8, 1, 3, 4, 6);
        Stream<Integer> s1 = l1.stream();

        s1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // You cannot use stream twice
        // A Java Stream can only be consumed once because it is designed to process data
        // in a single pass. After a terminal operation (like forEach, collect, etc.) is called,
        // the stream is considered closed and cannot be reused. Attempting to use it again
        // will throw an IllegalStateException.
        // This design ensures efficient resource management and prevents unexpected behavior
        // from reusing potentially mutated or exhausted data sources.
        // If you need to process the data again, you must create a new stream from
        // the source collection.
        //Below will produce error
        // s1.forEach(e -> System.out.print(e+" "));
        // System.out.println();


        // So, creating new stream for filter
        Stream<Integer> s2 = l1.stream();
        Stream<Integer> s3 = s2.filter(e -> e % 2 == 0);
        s3.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // map
        Stream<Integer> s4 = l1.stream().map(e -> e * 2);
        s4.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // map and filter
        List<Integer> l2 = l1.stream().filter(e -> e % 3 == 0).map(e -> e / 3).toList();
        l2.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // reduce
        int additionOfAllElements = l1.stream().reduce(0, (a, c) -> a += c);
        System.out.println(additionOfAllElements);

        // other methods
        int maxe = l1.stream().max(Integer::compareTo).get();
        System.out.println(maxe);

        int mine = l1.stream().min(Integer::compareTo).get();
        System.out.println(mine);
    }
}
