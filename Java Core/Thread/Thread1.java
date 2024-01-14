
// Threads.

// By extending Thread class.

//class T{ 
           // It is normal class 
//}

// But when we extend it with thread it becomes threa class.

class T1 extends Thread { // By extending Class T1 becomes Thread
    public void run() { // void run() method is used to perform action for a thread.
        for (int i = 0; i <= 40; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(20); // These(Thread.sleep) are thread methods.Pause the thread for 20 milliseconds.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class T2 extends Thread { // By extending Class T2 becomes Thread
    public void run() { // void run() method is used to perform action for a thread.
        for (int i = 0; i <= 40; i++) {
            System.out.println("How are you...!");
            try {
                Thread.sleep(20); // These(Thread.sleep) are thread methods.Pause the thread for 20 milliseconds.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {

        // Create instances of thread classes T1 and T2

        T1 obj1 = new T1(); // The obj1 one isnot just object it is now thread
        T2 obj2 = new T2(); // The obj2 one isnot just object it is now thread

        // Set priority for obj2 to maximum.It is also method of thread.
        obj2.setPriority(Thread.MAX_PRIORITY);
        
        try {
            Thread.sleep(40); // These(Thread.sleep) are thread methods. Pause the thread for 40 milliseconds
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Start the execution of threads
        obj1.start();
        obj2.start();

        // The start method is part in main method. It is used in main method while
        // execution.It only calls the run method.The start method is present inside thread class.
    }
}
