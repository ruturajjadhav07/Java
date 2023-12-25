// Java for loop is used to iterate over given condition

public class For_loop_6 {
    public static void main(String[] args) {

        // for( initialize, condition , increment or decrement ){
        //        code
        //        }


        System.out.println("\n\n=====================================");
        System.out.println("For Loop");
        System.out.println("=====================================");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);                 // starts printing from 0 to 10
        }


        System.out.println("\n\n=====================================");
        System.out.println("For Nested Loop");
        System.out.println("=====================================");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++) {          // Nested for loop
                System.out.println(i + " " + j);
            } // j loop
        } // i loop


        System.out.println("\n\n=====================================");
        System.out.println("For Each Loop");
        System.out.println("=====================================");


        // for (data type variable : name of array) {
        // code
        // }

        String[] lang = {"Java", "C++", "Python", "Javascript"};
        for (String i : lang) {
            System.out.println(i);
        }
    }
}