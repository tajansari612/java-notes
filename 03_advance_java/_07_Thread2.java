
// Thread Life Cycle
// A thread goes through the following states:
// New – Thread object created
// Runnable – Ready to run
// Running – Executing
// Blocked / Waiting – Waiting for resource
// Terminated – Execution finished


// Important Thread Methods
// Method             Description
// start()            Starts thread
// run()              Contains task
// sleep(ms)          Pauses thread
// join()             Waits for thread to finish
// yield()            Pauses to allow other threads
// setPriority()      Sets priority

// 1) start() — Start a new thread
// Creates a new call stack and invokes run() on a new thread.
// Never call run() directly if you want a new thread—calling run() 
// just runs code on the current thread.

// 2) run() — The task code
// Override this to define what the thread does.
// Called by the JVM when you invoke start().

// 3) sleep(long millis) — Pause current thread
// Temporarily pauses the current thread.
// Throws InterruptedException if the thread is interrupted during sleep.
// Example:
// try {
//     Thread.sleep(1000); // 1 second
// } catch (InterruptedException e) {
//     Thread.currentThread().interrupt(); // restore interrupt flag
// }


public class _07_Thread2 {
    public static void main(String[] args) {
        // 4) join() — Wait for another thread to finish
        // Current thread waits until the target thread completes.
        // Overloads: join(), join(long millis), join(long millis, int nanos).
        Thread t = new Thread(() -> {    
            try { 
                Thread.sleep(500); 
            } catch (InterruptedException ignored) {}
            System.out.println("Worker done");
        });    
        t.start(); 
        try{
            t.join(); // main waits here
            System.out.println("Continue after worker");
        }catch (InterruptedException e){}


        // 6) yield() — Hint to scheduler
        // Suggests the scheduler to give other threads a chance.
        // Not guaranteed; behavior is platform dependent.
        for (int i = 0; i < 5; i++) {    
            System.out.println("Working...");    
            Thread.yield();
        }


        // 7) setPriority(int) / getPriority() — Thread priority
        // Range: Thread.MIN_PRIORITY (1) → Thread.MAX_PRIORITY (10), default 5.
        // Just a hint; real effect is OS-dependent.
        Thread t1 = new Thread(() -> { /* work */ });
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY-2);
        t1.start();


        // 9) currentThread() — Get the current thread
        // Static method to obtain the running thread instance.
        Thread cur = Thread.currentThread();
        System.out.println(cur.getName());


        // 10) setName(String) / getName() — Name your threads
        // Helpful for logs & debugging.
        Thread t3 = new Thread(() -> {});
        t3.setName("db-writer");
        t3.start();
        System.out.println(t3.getName());
    }
}



