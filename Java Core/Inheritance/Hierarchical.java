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

// Let's consider a school and its students

class School {                                  // Base class
    public void schoolName(){
        System.out.println("MITWPU Kothrud");
    }
}

class Student1 extends School {                  // Inherits from School class
    public void student1Name(){
        System.out.println("Ruturaj");
    }
}

class Student2 extends School {                  // Inherits from School class
    public void student2Name(){
        System.out.println("Roodraksh");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        // Creating objects of Student1 and Student2, both inheriting from the School class
        Student1 stud1 = new Student1();
        Student2 stud2 = new Student2();
        
        stud1.student1Name();       // prints Ruturaj
        stud1.schoolName();         // prints MITWPU Kothrud
        stud2.student2Name();       // prints Roodraksh
        stud2.schoolName();         // prints MITWPU Kothrud
    }
}




// Explanation

// School is the base class representing a school with a method schoolName() to display the school's name.

// Student1 and Student2 are classes that inherit from the School class.

//Student1 has its own method student1Name() to display the name of one student, and similarly, Student2 has student2Name().




    
