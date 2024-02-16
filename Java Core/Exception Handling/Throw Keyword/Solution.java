public class Solution {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {

            int result = i / j; // This line will throw an ArithmeticException since division by zero is not allowed.

            System.out.println(result); // This line will not be executed if an exception occurs.

            // This condition will never be reached because an exception is thrown before it.
            if (j == 0) {
                throw new ArithmeticException(); // This line is unreachable due to the previous division by zero.
            }

        } catch (ArithmeticException e) {
            // Catch the ArithmeticException specifically

            System.out.println("I can't divide by zero"); // Print a message indicating the specific error.
        }
        // This catch block will not be executed because the previous catch block handles all ArithmeticExceptions.

        catch (Exception e) {
            System.out.println(e); // This line will not be executed because the ArithmeticException is caught above.

            System.out.println("\nError");
        }

        System.out.println("Okay........."); // This line will be executed whether an exception is occured or not.
    }
}
