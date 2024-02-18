import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
      // Create a new Hashset called nums that holds integers
      // You can use String if you ant to try.
        Set<Integer> nums = new HashSet<Integer>();// Using Set interface for flexibility.Hashset is class related to it.

      // Add integers to the nums set.Set has method name called 'add'.
        nums.add(999);
        nums.add(223);
        nums.add(654);
        nums.add(171);
        nums.add(270);
        nums.add(654);

       // Iterate through the elements of the nums set and print each element
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
      
        // This line prints the entire list, but it's commented out for simplicity
        // System.out.println(nums);
    }
}
