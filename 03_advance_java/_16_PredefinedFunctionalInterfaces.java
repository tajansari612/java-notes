import java.util.*;

// Predefined Functional Interfaces
// Java has 4 main categories:

// 1. Predicate

// Purpose:
// Takes one input
// Returns boolean
// Used for conditions / filtering

// Method
// boolean test(T t);
// Example
// Predicate<Integer> isEven = n -> n % 2 == 0;System.out.println(isEven.test(10)); // true
// Common Use
// list.stream()    .filter(n -> n > 10)    .forEach(System.out::println);



// 2️. Function

// Purpose
// Takes one input
// Returns one output
// Used for transformation

// Method
// R apply(T t);
// Example
// Function<String, Integer> length = s -> s.length();System.out.println(length.apply("Java")); // 4
// Stream Example
// list.stream()    .map(String::length)    .forEach(System.out::println);



// 3️.Consumer

// Purpose
// Takes one input
// Returns nothing (void)
// Used for printing / consuming data

// Method
// void accept(T t);
// Example
// Consumer<String> print = s -> System.out.println(s);print.accept("Hello Java");
// Stream Example
// list.forEach(System.out::println);``Show more lines



// 4️.Supplier

// Purpose
// Takes no input
// Returns one output
// Used to supply/generate values

// Method
// T get();
// Example
// Supplier<Double> random = () -> Math.random();System.out.println(random.get());


// 3. Summary of Predefined Interfaces (Easy Memory Trick)
// Think as a sentence:
// Predicate checks
// Function converts
// Consumer uses
// Supplier provides


// 4. Other Important Predefined Functional Interfaces
// BiFunction
// BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

// BiPredicate
// BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

// BiConsumer
// BiConsumer<String, Integer> show = (name, age) -> System.out.println(name + " " + age);


// 5. Real‑World Example (Interview Friendly)
class _16_PredefinedFunctionalInterfaces{
    public static void main(String[] args){
        List<String> names = Arrays.asList("Java", "Spring", "Boot");
        names.stream().filter(s -> s.length() > 4)   // Predicate     
        .map(String::toUpperCase)      // Function     
        .forEach(System.out::println); // Consumer
    }
}

// 6. Key Interview Points ⭐
// Functional Interface → one abstract method
// Enables Lambda expressions
// Located mainly in java.util.function
// Improves readability, less boilerplate
// Used heavily in Streams & Parallel Streams


// One‑Line Definition (Perfect for Interviews)
// A functional interface is an interface with exactly one abstract method, 
// used to support lambda expressions and functional programming in Java.