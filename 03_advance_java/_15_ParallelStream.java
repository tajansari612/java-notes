
// What is a Parallel Stream?
// A parallel stream is a type of Java Stream that processes elements concurrently using multiple 
// threads, instead of processing them one by one.
// It was introduced in Java 8 as part of the Stream API to improve performance by utilizing multiple 
// CPU cores.


// Sequential Stream vs Parallel Stream

// Sequential Stream:
// Processes elements one at a time
// Uses single thread
// list.stream()    .forEach(System.out::println);


// Parallel Stream
// Processes elements simultaneously
// Uses multiple threads
// list.parallelStream()    .forEach(System.out::println);


// How Parallel Streams Work (Internally)
// Java splits the data source into multiple chunks
// Each chunk is processed by a separate thread
// Threads come from ForkJoinPool.commonPool()
// Final result is combined automatically

// You don’t manage threads manually
// Execution order is not guaranteed



// Creating a Parallel Stream

// 1️.Using parallelStream()
// list.parallelStream().forEach(System.out::println);

// 2️.Converting a sequential stream
// list.stream().parallel().forEach(System.out::println);

// Both approaches are equivalent.

// Example
// Sequential Stream Example
// list.stream()    .map(n -> n * n)    .forEach(System.out::println);

// Parallel Stream Example
// list.parallelStream()    .map(n -> n * n)    .forEach(System.out::println);
// In parallel stream, map() may run on different threads.



// Order of Execution
// Parallel streams do not preserve order by default.
// list.parallelStream().forEach(System.out::println);
// To preserve order (slower):
// list.parallelStream().forEachOrdered(System.out::println);


// Advantages of Parallel Streams:
// Faster for large data sets
// Automatic thread management
// Cleaner code than manual multithreading
// Good for CPU‑intensive tasks

// Disadvantages / Limitations:
// Not always faster
// Overhead of thread creation & coordination
// Order is not guaranteed
// Risk of thread‑safety issues


// When to Use Parallel Streams
// Use parallel streams when:
// Data size is large
// Operations are CPU‑bound
// Tasks are independent
// No shared mutable state
// Order is not important


// When NOT to Use Parallel Streams
// Avoid when:
// Data size is small
// Operations involve I/O (DB, files, network)
// Using shared variables
// Running in web servers (thread contention)
// Order matters


// Wrong example:
// int sum = 0;list.parallelStream().forEach(n -> sum += n); // Not thread-safe
// Correct:
// int sum = list.parallelStream().mapToInt(Integer::intValue).sum();

// Real‑Life Analogy
// Sequential stream → One person doing all the work
// Parallel stream → Multiple people working at the same time


// Interview One‑Line Answer
// A parallel stream processes elements concurrently using multiple threads to improve performance 
// by utilizing multi‑core processors.


// Key Interview Points ⭐
// Introduced in Java 8
// Uses ForkJoinPool
// Best for large, CPU‑intensive tasks
// Not suitable for I/O or shared state
// Order not guaranteed


import java.util.*;
public class _15_ParallelStream {
    public static void main(String[] args) {
        // Example
        List<Integer> list = Arrays.asList(3,5,7,9,1,3,5,7,6);
        // Sequential Stream Example
        list.stream().map(n -> n * n).forEach(System.out::println);

        // Parallel Stream Example
        list.parallelStream().map(n -> n * n).forEach(System.out::println);
        // In parallel stream, map() may run on different threads.
    }
}
