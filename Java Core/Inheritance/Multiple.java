// Inheritance
// It has ability to inherit other class operations.
// It is created by class keyword.
// The first class is know as base class or parent class.
// The class created from base class is called derived class or subclass.It is done by extend keyword.
// By inheriting classes we can reuse code.
// It allows to perform multiple operations.
// Types are single level,multilevel,hierarchical,multiple


// Remember if we create class inside main file (class file name) first we need to create instance of main class file and then next of our created class.

// Multiple Inheretance
// Java dosent support multiple inheritance

// Remember - To perform multiple inheritance we need to use interface and then implement it.



// For instance, consider trying to inherit from two different classes:

class Greet1 {
    public void greet() {
        System.out.println("Hello..");
    }
}

class Greet2 {
    public void greet() {
        System.out.println("How are you");
    }
}

// Error: Java doesn't support inheriting from multiple classes directly
 class Greet extends Greet1, Greet2 {
    public void greet() {
         System.out.println("You...?");
     }
 }

public class Multiple {
    public static void main(String[] args) {
        greet G1 = new greet();               // G1 dont know wheter to execute greet1 or greet2.So it will error
                                              // This can be done through iterface implementation
    }
}



//Explanation :

// Interfaces Greet1 and Greet2 declare the greet() method without defining its implementation.

// Class Greet implements both interfaces and provides the implementation for the greet() method.




