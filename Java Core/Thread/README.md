# Threads
## What is Thread...?
*Doing multiple task and dividing task into sma;l units is called thread.*
*Threads are lightweight and its smallest part of unit.*
*The threads are java class used to achieve thread programming.*
*It is same like classs that provides constructor method to create operations on threads.*



# Types of threads
## *1) [By extending Thread class](https://github.com/ruturajjadhav07/Java/blob/main/Java%20Core/Thread/Thread1.java)*
*Threads are created by extending the Thread class in Java.*
*void run() method is used to perform action for a thread.*
*The run() method is called by start() method.*

*The start() method is used in main while execution*
*The start() method is present in Thread class and calls the run() method to preform the multitasking*


## *2) [By implementing runnable interface](https://github.com/ruturajjadhav07/Java/blob/main/Java%20Core/Thread/Thread2.java)*
*Multuple inheritance is not supported by java so we implement it by "Runnable" interface.*
*Thread is a class which implements Runnable interface*

*The "Runnable" interface requires implementing the "run" method, where the actual code for the thread's task is placed.*
*The Runnable interface don't have thread method (Start()) so you need to create a new instance of thread that is (Thread obj = new Thread(parameter)).*

## Using Lambda expression
 *Always remember : An Runnable interface is   **" @FunctionalInterface "**   so we can create instance using lambda. [Click me](https://github.com/ruturajjadhav07/Java/blob/main/Java%20Core/Thread/lambda.java) to see using lambda expression*
 
 *lambda expression makes code look easier and cleaner*

