
import java.util.Scanner;

public class inputt {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { // We surround it with try catch if there is error it will display
                                                    // it.
            // Scanner is our class that is used to read the input from user.

            System.out.print("Enter Name : "); // We read input by printing the sentence.
            String name = sc.nextLine(); // the data type should macth the given input i.e. if we are giving strint use
                                         // String Data type.and same for other data types.

            System.out.print("Enter Age : ");// We read input by printing the sentence.
            int age = sc.nextInt(); // We will read it by using int data type.

            System.out.println("Hello i am " + name + " and my age is " + age); // Concatinating the output with taken
                                                                                // user input.
        }

    }
}
