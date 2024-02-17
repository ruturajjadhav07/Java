import java.util.Vector; 
import java.util.List;   

public class Solution {

  
    public static void main(String[] args) {

        // Create a new Vector called nums that holds integers
        List<Integer> nums = new Vector<Integer>(); // Using List interface for flexibility.Vector is class related to it.

        // Add integers to the nums list
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(6);

        // Iterate through the elements of the nums list and print each element
        for (int n : nums){
            System.out.print(n + " ");
        }

        // This line prints the entire list, but it's commented out for simplicity
        // System.out.println(nums);
    }
}
