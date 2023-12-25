//String is written in " ".Anything written in " " is in string format.

public class String_4 {

    public static void main(String[] args) {

        System.out.println("\n\n=====================================");
        System.out.println("String Methods");
        System.out.println("=====================================");
        String Quote = ("You Cant Make History In Your Comfort Zone..........!");

        //String has multiple methods related with it such as length(),toUpperCase() and many more.

        System.out.println(Quote.length());                     // Gives String length
        System.out.println(Quote.toUpperCase());                // Writes in Upper Case
        System.out.println(Quote.toLowerCase());                // Writes in Lower Case
        System.out.println(Quote.substring(30));                // It deletes the part from string[from index number] and write remained part.
        System.out.println(Quote.substring(30,37));             // It writes extracted information from string



        System.out.println("\n\n=====================================");
        System.out.println("String Concatenation");
        System.out.println("=====================================");

        // Concatenation meeans connecting
        // It is used to connect the two Strings or Multiple
        // It is done through " + " operator

        String s1 = "Hello";
        String s2 = "World..!";

        System.out.println(s1+s2);          // It will give HelloWorld..!
        System.out.println(s1.concat(s2));  // Using Concat method.



    }


}
