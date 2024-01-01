// Inheritance
// It has ability to inherit other class operations.
// It is created by class keyword.
// The first class is know as base class or parent class.
// The class created from base class is called derived class or subclass.It is done by extend keyword.
// By inheriting classes we can reuse code.
// It allows to perform multiple operations.
// Types are single level,multilevel,hierarchical,multiple


// Remember if we create class inside main file (class file name) first we need to create instance of main class file and then next of our created class.

// Multilevel Inheritance
// Multilevel inheretance is used when there are more than two classes
class Dog {                                        //Base class
   public void dog(){
       System.out.println("Woofy need Food..");
   }
}

class Cow extends Dog {                            // Inherits Dog class
   public void cow(){
       System.out.println("Mercy need Sleep..");
   }
}

class Cat extends Cow {                            // Inherits Cow class
   public void cat(){
       System.out.println("Meow is yawning..");
   }
}

public class MultiLevel {
    public static void main(String[] args) {
       Cat sound = new Cat();                       // Creating Cat class object it will have both Dog and Cow class

        sound.dog();
        sound.cow();
        sound.cat();
    }
}
