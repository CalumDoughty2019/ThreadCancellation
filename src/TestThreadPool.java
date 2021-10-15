import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

    static final int MAX_Threads= 2;

    public static void main(String[] args)
    {
        Runnable run1 = new WorkerThread("Thread1");
        Runnable run2 = new WorkerThread("Thread2");
//        Runnable run2 = new Job("task 2");
//        Runnable run3 = new Job("task 3");
        //A new thread pool is created with maximum number of threads
        ExecutorService newpool = Executors.newFixedThreadPool(MAX_Threads);
        newpool.execute(run1);
        newpool.execute(run2);
//        newpool.execute(run3);
        newpool.shutdown();
    }

}
