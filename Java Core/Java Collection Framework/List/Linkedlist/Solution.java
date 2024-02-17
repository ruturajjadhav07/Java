import java.util.LinkedList; 

public class Solution {
    public static void main(String[] args) {
        // Create a new LinkedList called nums that holds integers.
        // You can use String if you ant to try.
        LinkedList<Integer> nums = new LinkedList<>(); // Using LinkedList for flexibility.Linkedlist is class related to it.

        // Add integers to the nums list
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(6);

        // Iterate through the elements of the nums list and print each element
        for (int n : nums) {
            System.out.print(n + " ");
        }

        // Add an element at the beginning of the list
        nums.addFirst(10);

        // Print the modified list
        System.out.println("\nModified List:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
