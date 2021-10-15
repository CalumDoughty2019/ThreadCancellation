public class NonVolatileThread {

    private static volatile boolean exit = false; //set as "volatile" to set variable the same across all threads (not locally)

    public static void main(String[] args) {
        System.out.println("Starting main thread...");

        new Thread() {
            public void run(){
                System.out.println("Starting inner thread...");

                while(!exit){

                }
                System.out.println("Exiting inner thread...");
            }
        }.start();

        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Caught: " + e);
        }

        exit = true;
        System.out.println("Exiting main thread...");
    }
}
