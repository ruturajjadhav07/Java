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


// Let's imagine different animals with specific actions

class Dog {                                        // Base class
   public void dog(){
       System.out.println("Woofy needs Food..");
   }
}

class Cow extends Dog {                            // Inherits from Dog class
   public void cow(){
       System.out.println("Mercy needs Sleep..");
   }
}

class Cat extends Cow {                            // Inherits from Cow class
   public void cat(){
       System.out.println("Meow is yawning..");
   }
}

public class MultiLevel {
    public static void main(String[] args) {
       Cat sound = new Cat();                       // Creating a Cat object; it will have behaviors from Dog, Cow, and Cat classes

        sound.dog();                                // Accessing the method from the Dog class
        sound.cow();                                // Accessing the method from the Cow class
        sound.cat();                                // Accessing the method from the Cat class
    }
}



// Explanation:

// Dog is the base class that represents a dog and has a method dog() indicating its need for food.

// Cow is a class that inherits from Dog and introduces a new method cow() representing the cow's need for sleep.

// Cat further inherits from Cow and introduces a new method cat() depicting a cat's action, yawning.
