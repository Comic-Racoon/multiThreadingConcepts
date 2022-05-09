package threading.by_extending_thread_class.defining_thread_1;

class mythread extends Thread{


    public void run(){

        // what ever is in "run" is job of thread
        // it is execuited by child thread
        for (int i =0; i< 10 ; i++){
            System.out.println("Child Thread");
        }
    }
}
public class basic {

    public static void main(String[] args){
        // main thread responsible for call main method
        // main main method helps to create child thread object for execution

        mythread k = new mythread();  // thread initialiazition
        k.start(); // statting of defined thread

        for(int i =0; i< 10 ; i++){
            System.out.println("Main Thread");  // execuited by main thread
        }
    }
}
