public class Solution {

    public static void main(String[] args) {
        int n = 10;
        try {
            if (n / 0 == 0) { // Just consider this.
                System.out.println("Even Number..!"); // We cant divide number by zero it will throw error and catch the
                                                      // error.
            } else {
                System.out.println("Odd Number..!");
            }
        } catch (Exception e) { // e is refered to Exception class

            // System.out.println(e.getMessage()); // This will print "/ by zero" i.e. can't
            // divide by zero.
            System.out.println(e); // As e is referred to exception class it will catch error and
                                   // print as java.lang.ArithmeticException: / by zero
        }
    }
}
