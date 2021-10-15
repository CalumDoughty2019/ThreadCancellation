import java.util.Date;

public class WorkerThread implements Runnable {

    private String name;
    private static volatile int counter = 0;

    public WorkerThread(String s) {
        name = s;
    }

    // The task name will be populated first for the ones which were not running already, and the thread will sleep for 2s
    //This entire method will be repeated 6 times
    public void run() {
        try {
            for (int i = 0; i < 1000000; i++) {
                if (i == 10) {
                    System.out.println(name + ": " + i); //prints the task name every time the new task is started
                    counter = counter + 1;
                    //i++;
                }else if(i == 1000){
                    System.out.println(name + ": " + i); //prints the task name every time the new task is started
                    counter = counter + 1;
                }else if(i == 10000){
                    System.out.println(name + ": " + i); //prints the task name every time the new task is started
                    counter = counter + 1;
                }else if(i == 250000){
                    System.out.println(name + ": " + i); //prints the task name every time the new task is started
                    counter = counter + 1;
                }else{
                    //System.out.println(name + ": " + i);// prints the job name which is already running
                    counter = counter + 1;
                }
                Thread.sleep(1); // The thread is in sleep mode for 2 secs
            }
            System.out.println(name + " job is completes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            System.out.println("Counter: " + counter);
        }
    }

}
