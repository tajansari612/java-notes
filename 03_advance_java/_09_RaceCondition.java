
class Increment{
    private int counter;
    Increment() {
        counter=0;
    }
    public synchronized void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}

public class _09_RaceCondition {
    public static void main(String[] args){
        Increment obj1 = new Increment();
        Thread t1 = new Thread(
            () -> {
                for(int i=0;i<10000;i++){
                    obj1.increment();
                }
            }
        );

        Thread t2 = new Thread(
            () -> {
                for(int i=0;i<10000;i++){
                    obj1.increment(); 
                }
            }
        );

        
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){e.printStackTrace();}

        System.out.println(obj1.getCounter());
    }
}
