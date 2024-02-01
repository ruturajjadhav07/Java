// While loop is used to execute given conditions
// It is used to iterate on given conditions
// if conditions meets the given condition the loop will stop.
// If it does not meet it will go in infinite loop.

public class WhileLoop {
    public static void main(String[] args) {

        // while (condition){
        // code
        // increment/decrement
        // }

        System.out.println("\n\n=====================================");
        System.out.println("Basic While Loop");
        System.out.println("=====================================");

        int i = 0;
        while (i < 5) {
            System.out.println(i);   //starts from 0 to 4.It alwyas starts from 0.
            i++;
        }


        System.out.println("\n\n=====================================");
        System.out.println("Break Loop");
        System.out.println("=====================================");

        int j = 0;
        while (j < 8) {
            System.out.println(j);
            if (j == 5) {               // It will break until it comes to 5
                break;
            }
            j++;
        }


        System.out.println("\n\n=====================================");
        System.out.println("Continue Loop");
        System.out.println("=====================================");

        int k = 0;
        while (k < 8) {
            if (k == 4) {
                k++;         // It increments the number so it moves from 4 to 5 and skip printing 4.
                continue;
            }
            System.out.println(k);
            k++;
        }
    }
}
