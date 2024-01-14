// Threads.
// By implementing Runnable Interface amd lambda.
// An Runnable interface is always FunctionalInterface


public class Solution {

    public static void main(String[] args) {

        // Using lambda expressions to define the run method for obj1

        Runnable obj1 = () -> { // Lambda expression.

            for (int i = 0; i <= 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(20); // These are thread methods
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };

        // Using lambda expressions to define the run method for obj1

        Runnable obj2 = () -> { // Lambda expression.
            for (int i = 0; i <= 10; i++) {
                System.out.println("How are you...!");
                try {
                    Thread.sleep(20); // These(Thread.sleep) are thread methods.Pause the thread for 20 milliseconds.
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        };

        // The two thread have no idea about obj1 and obj2 and there classes.
        // The Runnable don't have start() method so we need to create a new thread
        // instance.
        // and pass the instance of created object.

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        // Start the execution of the threads
        T1.start();
        T2.start();

        // The start method is part in main method. It is used in main method while
        // execution.It only calls the run method.The start method is present inside
        // thread class.

        // It makes code look easier and cleaner.
    }
}
