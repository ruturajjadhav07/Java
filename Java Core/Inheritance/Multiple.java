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

// Remember - To perform multiple inheritance we need to use interface and then implement it



class greet1{
    public void greet(){
        System.out.println("Hello..");
    }
}

class greet2{
    public void greet(){
        System.out.println("how are");
    }
}

class greet extends greet1,greet2{
    public void greet(){
        System.out.println("you...?");
    }
}


public class Multiple {
    public static void main(String[] args) {
        greet G1 = new greet();               // G1 dont know wheter to execute greet1 or greet2.So it will error
                                              // This can be done through iterface implementation
    }
}
