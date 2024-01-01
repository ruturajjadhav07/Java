// Methods are basically block of code.
// It makes easier for programmer and other user to understand code
// They are easy to understand
// We can reuse code again and again

// You can also pass parameters to methods

// Public method is used to create public method
// It can be accessed everywhere
// In public method we need to make objects from main method(name of class)

public class PublicMethod {

    public void method() {
        System.out.println("You Called Me..........😊😊😊");
        System.out.println("Using Public Method");

        System.out.println("\nWhat is Public Method...?");
        System.out.println("Public method is called to create public method.\nWe need to make object for calling out public methods.\nObject is created from main class(name of file or class)");
    }

    public void Greet(String greet) {    // Using Parameters
        System.out.println("\n\n*******************************");
        System.out.println("Hello " + greet);
    }

    public static void main(String[] args) {     // This is also a method
        // Public means can be used or accessed by anyone
        // Static means related to class and does not create object
        // void means it return nothing
        // main() also called entry point in java.Without main programm will not run
        // String is string type array


        // Here our class name is PublicMethod that will be "Main class" so we create object from it
        // The new keyword creates new object

        PublicMethod message = new PublicMethod();  // message is our created object

        // as we have created object from Main class so it will associate all method with it and our created methods too

        message.method();              // Calling public method with created Object.

        message.Greet("Ruturaj");      // Calling public method with parameter (greet)

    }
}
