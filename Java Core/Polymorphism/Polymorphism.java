// Polymorphism.
// Poly means many and morphism means behaviors that is many behaviours.
// Two types
// 1) compile( method overloading.It decides during compile time based on parameter or what you give) time
// 2) run time ( method overriding.It decides on run time what to execute.

// Same object behaviour different is called Polymorphism.

import java.io.*;
import java.util.*;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();                       // Class A object
        obj.show();                            // It will print "in A show"

        obj = new B();                         // Here class is B.The particular created object is referring to B()
        obj.show();                            // Therefore it will print "in B show".Because it is linked to B() (Method overriding)

        obj = new C();                         // Here class is C.the particular created object is referring to C()
        obj.show();                            // Therefore it will print "in B show".Because it is linked to C() (Method overriding)


        // It is called run time polymorphism because it decides which method to run or execute.

        
        // Note it only refers to class B and class C because they extend class A
        // Below code will give error The C does not extend B

        // B obj1 = new C();
     

    }
}




// Explanation:

// class A is the superclass, while class B and class C are its subclasses.

// All classes have a method show(), but subclasses (B and C) override it with their own implementations.
