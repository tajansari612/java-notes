// Multithreading in Java
// What is Multithreading?
// Multithreading is a feature in Java that allows multiple threads to run 
// concurrently within a single program to perform tasks simultaneously.
// A thread is the smallest unit of execution inside a process.

// Why Multithreading is Needed?
// Multithreading helps to:
// Improve performance
// Utilize CPU efficiently
// Execute tasks in parallel
// Keep applications responsive (e.g., UI apps)


// Real‑Life Example
// Single‑threaded: One person cooking, cleaning, and answering calls
// Multithreaded: One cooks, one cleans, one answers calls


// Process vs Thread
// Process                     Thread
// Heavyweight                 Lightweight
// Has its own memory          Shares memory
// Slower context switching    Faster
// Independent                 Dependent


// Ways to Create Threads in Java
// 1️. By Extending Thread Class
// class Hi extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hi");

//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){e.printStackTrace();}
            
//         }
//     }
// }

// class Hello extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hello");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){e.printStackTrace();}
//         }
//     }
// }



// 2️. By Implementing Runnable Interface (Recommended)
class Hi implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){e.printStackTrace();}
            
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){e.printStackTrace();}
        }
    }
}


// 3️. Using Lambda Expression (Java 8+)
// Thread t = new Thread(() -> {   
//     System.out.println("Thread running");
// });
// t.start();
class _07_Thread{
    public static void main(String[] args){
        // 1. Using Thread
        // Hi h1 = new Hi();
        // Hello h2 = new Hello();
        // h1.start();
        // h2.start();


        // 2. Using Runnable interface
        // Thread h1 = new Thread(new Hi());
        // Thread h2 = new Thread(new Hello());
        // h1.start();
        // h2.start();


        // Using lambda expression
        Thread t1 = new Thread(() -> {
            for(int i=0;i<100;i++){
                System.out.println("sleep");
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<100;i++){
                System.out.println("wake");
            }
        });

        t1.start();
        t2.start();
        
    }
}