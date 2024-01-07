// It is an type of loop Statement
// It is used to perform operation on given conditions.
// If "if" condition is true it will execute if condition. if not then it will execute "else" condition.

public class If_Else_5 {

    public static void main(String[] args) {

        System.out.println("\n\n=====================================");
        System.out.println("if...else");
        System.out.println("=====================================");

        int n1 = 10;
        int n2 = 20;

        if (n1 < n2) {
            System.out.println(true);                 // 10 is less than 20 it will execute.
        } else {
            System.out.println(false);                // 20 is greater than 10 it will not execute.
        }


        System.out.println("\n\n=====================================");
        System.out.println("else...if");
        System.out.println("=====================================");

        // It is used to check multiple statements.
        // also called ladder statement.

        int n3 = 50;

        if (n3 > 60) {
            System.out.println("n3 is greater than 50");
        } else if (n3 < 40) {
            System.out.println("n3 is less than 50");
        } else if (n3 == 50) {
            System.out.println("It is equal to 50");         // It will execute this statement
        } else {
            System.out.println("Invalid");
        }


        System.out.println("\n\n=====================================");
        System.out.println("Nested If");
        System.out.println("=====================================");

        int age = 22;
        String name = "Rutu";

        if (age <= 22) {
            if (name == "Rutu") {                         // Nested if statement.
                System.out.println("It is correct");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Incorrect");
        }
    }

}
