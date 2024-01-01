// Inheritance
// It has ability to inherit other class operations.
// It is created by class keyword.
// The first class is know as base class or parent class.
// The class created from base class is called derived class or subclass.It is done by extend keyword.
// By inheriting classes we can reuse code.
// It allows to perform multiple operations.
// Types are single level,multilevel,hierarchical,multiple


// Remember if we create class inside main file (class file name) first we need to create instance of main class file and then next of our created class.

// Hierarchical Inheritance
// when mutiple classes inherit one class it is called hierarchical inheritance

class School{                                  // Base class
    public void SName(){
        System.out.println("MITWPU Kothrud");
    }
}

class Student1 extends School{                 // Inherits School class
    public void S1name(){
        System.out.println("Ruturaj");
    }
}

class Student2 extends School{                 // Inherits School class
    public void S2name(){
        System.out.println("Roodraksh");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        // Creating objects of Student1 and Student2 as they bot inherit one class School
        
        Student1 stud1 = new Student1();
        Student2 stud2 = new Student2();
        
        stud1.S1name();                  // prints Ruturaj
        stud1.SName();                   // prints MITWPU kothrud
        stud2.S2name();                  // prints Roodraksh
        stud2.SName();                   // prints MITWPU kothrud

    }
}
