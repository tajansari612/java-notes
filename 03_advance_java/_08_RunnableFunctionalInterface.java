class _08_RunnableFunctionalInterface{
    public static void main(String[] args){
        Thread t1 = new Thread(
            () -> {
                for(int i=0;i<100;i++){
                    System.out.println("Hi");
                    
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e){e.printStackTrace();}
                }
            }
        );
        Thread t2 = new Thread(
            () ->{
                for(int i=0;i<100;i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e){e.printStackTrace();}
                }
            }
        );

        t1.start();
        t2.start();
    }
}