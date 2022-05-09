package threading.by_extending_thread_class.threadOverloding_2;

class myThread extends Thread{
    public void run(){
        System.out.println("no-args run");
    }
    public void run( int n ){
        System.out.println( " int arg run " );
    }
}
public class threadRunMethodOverloding {
    /*
    Notes :-
    - over loading of run method
    - is always possible but thread class start method can
     invoke no-arg run method the other over loaded method we have
      to all explicitly like a normal method call.
    */


    public static void main(String... args) {
        myThread k =  new myThread();


        // by default start method will call no args method
        k.start();
    }

}
