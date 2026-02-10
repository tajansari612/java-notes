// What is Synchronization in Java?
// Synchronization in Java is a mechanism that ensures only one thread 
// can access a shared resource at a time, preventing:
// Race conditions
// Inconsistent data
// Thread interference

// In multithreading, multiple threads may try to access and modify shared data 
// simultaneously, causing unpredictable results.
// Synchronization ensures thread safety.


// Why Synchronization is Needed (Race Condition Example)
// Without synchronization:
class Counter {    
    int count = 0;    
    void increment() {        
        count++;    
    }
}

// How Synchronization Solves This
// 1️. Synchronized Method
// Locks the entire method on the object’s monitor.
class Counter2 {    
    int count = 0;    
    synchronized void increment() {        
        count++;   // at a time → result is always **2000**.---## 
    }
}
// 2️. Synchronized Block 
// More efficient—lock only the **critical section**, not entire method.
class Counter3 {    
    int count = 0;   
    void increment() {        
        synchronized (this) {            
            count++;        
        }    
    }
}
// Why use synchronized block?
// More control
// Faster
// Only synchronizes required code

public class _07_Thread3_Synchronization {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();        
        Thread t1 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) c.increment(); 
        });        
        Thread t2 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) c.increment(); 
        });        
        t1.start();        
        t2.start();        
        t1.join();        
        t2.join();        
        System.out.println(c.count);   // NOT always 2000 (race condition) 


        Counter2 c2 = new Counter2();        
        Thread t3 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) c2.increment(); 
        });        
        Thread t4 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) c2.increment(); 
        });        
        t3.start();        
        t4.start();        
        t3.join();        
        t4.join();        
        System.out.println(c2.count);  // Always 2000 (No race condition)
    
    }
}

// Drawbacks of Synchronization
// Slower performance (locking overhead)
// Risk of deadlocks
// Complex debugging
// Reduces concurrency

// Deadlock
// What is Deadlock?
// When two threads wait for each other forever.
// Example:
// Thread A locks Resource 1 → waits for Resource 2
// Thread B locks Resource 2 → waits for Resource 1

// Avoid using:
// Proper locking order
// tryLock()