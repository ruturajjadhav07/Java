// Methods are basically block of code.
// It makes easier for programmer and other user to understand code
// They are easy to understand
// We can reuse code again and again

// You can also pass parameters to methods

// Static method also called as class method as it is related to class

// We dont need to make object for calling out static methods
// if we use static then it is already related to class and main method

public class StaticMethod {

    static void method() {       // Static method
        System.out.println("You Called Me..........😊😊😊");
        System.out.println("Using Static Method");

        System.out.println("\nWhat is Static Method...?");
        System.out.println("Static method also called as class method as it is related to class.\nWe dont need to make object for calling out static methods.\nIf we use static then it is already related to class and main method");
    }

    static void SumofNum(int i, int j) {    // Using Parameters
        System.out.println("\n\n*******************************");
        int sum = i + j;
        System.out.println("Sum of " + i + " and " + j + " is " + sum);
    }


    public static void main(String[] args) {       // This is also a method
        // Public means can be used or accessed by anyone
        // Static means related to class and does not create object
        // void means it return nothing
        // main() also called entry point in java.Without main programm will not run
        // String is string type array


        method();                                  // Calling static method.Object is not created.
        SumofNum(5, 7);                        // Calling Static method with parameters (i ,j)
    }

}
