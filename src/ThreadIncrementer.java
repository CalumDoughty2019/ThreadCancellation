//Exercise 6.13 - PART1
public class ThreadIncrementer implements Runnable{

    private String name;
    private Thread thread;
    private Boolean exit;
    private static int counter = 0;
    //private static volatile boolean exit = false;

    public ThreadIncrementer(String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New Thread: " + thread);
        exit = false;
        thread.start();
    }

    public static void main(String[] args) {

        ThreadIncrementer thread1 = new ThreadIncrementer("First Thread");
        ThreadIncrementer thread2 = new ThreadIncrementer("Second Thread");

        try{
            Thread.sleep(500);
            //thread1.run();
            //thread2.run();
            //thread1.stop();
            //thread2.stop();
        }catch(InterruptedException e){
            System.out.println("Caught: " + e);
        }
        System.out.println(thread1.name + ": STOPPING");
        System.out.println(thread2.name + ": STOPPING");
        System.out.println("Counter = " + counter);
        System.out.println("Exiting");

    }

    //@Override
    public void run(){
        //System.out.println(name + ": " + i);
        for(int i = 0; i < 1000000; i++){
            //System.out.println(name + ": " + i);
            counter += 1;
        }
    }
}
