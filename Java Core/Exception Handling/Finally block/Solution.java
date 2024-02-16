public class Solution {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        // also try with j = 2
        try {
            int result = i / j;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("I can't divide by zero");
        } finally {   // finally block
            System.out.println("This block always executes, regardless of whether an exception occurred or not.");
        }
    }
}
