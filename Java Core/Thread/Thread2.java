// Threads.
// By implementing Runnable Interface.


//class T{
// It is normal class
//}


class T1 implements Runnable { // Class T1 becomes Runnable interface
    public void run() { // void run() method is used to perform action for a thread.
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(20); // These are thread methods
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class T2 implements Runnable {  // Class T2 becomes Runnable interface
    public void run() { // void run() method is used to perform action for a thread.
        for (int i = 0; i <= 10; i++) {
            System.out.println("How are you...!");
            try {
                Thread.sleep(20); //  These(Thread.sleep) are thread methods.Pause the thread for 20 milliseconds.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class Thread2 {

    public static void main(String[] args) {

        // Create instances of thread classes T1 and T2

        T1 obj1 = new T1(); // The obj1 one is not just object it is now runnable
        T2 obj2 = new T2(); // The obj2 one is not just object it is now runnable


        // The two thread have no idea about obj1 and obj2 and there classes.
        // The Runnable don't have start() method so we need to create a new thread instance.
        // and pass the instance of created object.

        Thread T3 = new Thread(obj1);
        Thread T4 = new Thread(obj2);


        // Start the execution of threads
        T3.start();
        T4.start();

        // The start method is part in main method. It is used in main method while
        // execution.It only calls the run method.The start method is present inside thread class.


    }
}
