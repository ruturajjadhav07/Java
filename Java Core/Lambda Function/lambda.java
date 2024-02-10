// Lambda Expression
// It is denoted by "->"
// It reduces code typing and is easy to understand.


@FunctionalInterface // Declared Functional Interface
interface I1 {
    void run();  
}

interface I2 {
    String name(String name);
}

interface I3 {
    String name(String name);
}

public class LambdaExpression {

    public static void main(String[] args) {

        System.out.println("\n=============================");

        System.out.println("Without Arguments");  
        // lambda expression
        I1 obj = () -> System.out.println("Running...");     // runs void run() interface I1
        obj.run();

        System.out.println("\n=============================");

        System.out.println("\n=============================");

        System.out.println("With Arguments");
        // read line no 5.
        I2 obj1 = (name) -> {             // runs String with wrgument interface I2
            return name;
        }; // Lamba with return statement need curly braces.
        System.out.println("Hello" + obj1.name(" Ruturaj"));

      
        System.out.println("\n=============================");
        System.out.println("Same example like interface I2");

      
        I3 obj2 = (name) -> name;   // Same like interface I2.See how code is reduced and space is saved.
        System.out.println("Hello " + obj2.name("I am new here."));
        // When we have statement and that is return type.There is no need to mention it.
        // It automatically mentions it after "->" after this expression.

    }
}

// You can see in interface how lambda expression make it easy to read and type the code.
