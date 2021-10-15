import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// The Job class will be executed in this case
class Job implements Runnable {
    private String name;

    public Job(String s) {
        name = s;
    }

    // The task name will be populated first for the ones which were not running already, and the thread will sleep for 2s
    //This entire method will be repeated 6 times
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                if (i == 0) {
                    Date d = new Date();
                    System.out.println("We are in "
                            + " task name - " + name); //prints the task name every time the new task is started
                } else {
                    System.out.println("The job " +
                            name + " is already running "); // prints the job name which is already running
                }
                Thread.sleep(2000); // The thread is in sleep mode for 2 secs
            }
            System.out.println(name + " job is completes");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
