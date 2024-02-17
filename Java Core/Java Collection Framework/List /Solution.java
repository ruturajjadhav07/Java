import java.util.ArrayList; 
import java.util.List;      

public class Solution {

    public static void main(String[] args) {

        // Create a new ArrayList called nums that holds integers
        // You can use String if you ant to try.
        List<Integer> nums = new ArrayList<Integer>(); // Using List interface for flexibility.ArrayList is class related to it.

        // Add integers to the nums list.List has method name 'add'
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(6);

        // Iterate through the elements of the nums list and print each element
        for (int n : nums){        // Enhanced loop
            System.out.print(n + " ");
        }

        // This line prints the entire list, but it's commented out for simplicity
        // System.out.println(nums);
    }
}
