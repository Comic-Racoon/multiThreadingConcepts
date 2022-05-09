package threading.by_implementing_runnable_interface;

public class exercise_1 {

    static class myRunnable implements Runnable{

        @Override
        public void run() {

            // job of the thread
            // executed by child thread
            for(int i=0; i< 10; i++){
                System.out.println("child thread");
            }
        }
    }

    public static void main(String[] args) {
        myRunnable r = new myRunnable();
        Thread t = new Thread(r);

        t.start();

        for(int i =0; i< 10; i++){
            System.out.println("main thread");
        }

    }

}
