
// Final Keyword.
// It can be used in varaible, class, methods.
// Final using means making constant or permanent.You restrict the part of code.

// Using Final in class

final class A {

    public void show() {
        System.out.println("Name 1");
    }

    public void Show1(String name) {
        System.out.println("Hello " + name);
    }

}

// class B extends A{ // It will Give error The type B cannot subclass the final class A.It will stop Inheritance
//
// }

public class Final {       // method name is final.It is not declared as final(Keep in mind).

    static class C {
        static final void show() {
            System.out.println("Ruturaj");
        }

        static void method1(int n1, int n2) {
            System.out.println(n1 + n2);
        }

    }

    static class D extends C {
        static void show1() { // After making static make show1.It cannot use same method name because it is made final and stops method overriding.
           
            // If not made final use show()
            System.out.println("Sairaj");   // Trying to override a final method will result in an error.
        }
    }

    public static void main(String[] args) {

        System.out.println("\n==================================");
        
        // Using Final variable
        final int n = 9;
        System.out.println("Final variable value is  " + n);
        
        // n = 10; // This line will give error as you cant change the value of n it is declared final variable.

        System.out.println("\n==================================");

        D obj = new D();
        
        // It will override to Sairaj.

        obj.show(); //we use final in Class C it will stop overriding (Sairaj) and prints Ruturaj.
        obj.method1(3, 9);

        // To better understand first run with static and then just remove static from class C and run the code and check output and make show() in class D.
        // That is  Modify the code by removing final keywords and observe changes to better understand their impact.
    }

}



