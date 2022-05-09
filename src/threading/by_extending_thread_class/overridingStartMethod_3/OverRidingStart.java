package threading.by_extending_thread_class.overridingStartMethod_3;

public class OverRidingStart {

    static class mythread extends Thread{
        public void start(){
            super.start();
            System.out.println("start method");
        }
        public void run(){
            System.out.println("run method ");
        }
    }

    public static void main(String[] args) {
        mythread t = new mythread();
        t.start();
        System.out.println("main method");
    }

    /*
    Possible ops :- start -> main -> run
                    run -> start -> main
                    start -> run -> main
                    */
}
