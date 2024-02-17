import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        // Create a new Stack called stack that holds integers
        Stack<Integer> stack = new Stack<>();

        // Add integers to the stack
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(6);

        // Pop elements from the stack and print each element
        while (!stack.isEmpty()) {
            int n = stack.pop();
            System.out.print(n + " ");
        }

        // This line prints the entire stack, but it's commented out for simplicity
        // System.out.println(stack);
    }
}
