
class Hi extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");

            try{
                Thread.sleep(10);
            }catch(InterruptedException e){e.printStackTrace();}
            
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
class _07_Thread{
    public static void main(String[] args){
        Hi h1 = new Hi();
        Hello h2 = new Hello();

        h1.setPriority(Thread.MAX_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY+2);


        h1.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){e.printStackTrace();}
        h2.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){e.printStackTrace();}
        
    }
}