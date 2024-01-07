// Operators are part of Java
// They are used to perform mathematical operations on declared variables and values
// Types of operators are

public class Operators_3 {

    public static void main(String[] args) {

        System.out.println("\n\n=====================================");
        System.out.println("Arithmetic Operator");
        System.out.println("=====================================");
        // Operator no 1 = Arithmetic Operator (+,-,*,/,%)
        int num1 = 6;
        int num2 = 1;

        System.out.println("Addition = " + (num1 + num2));         //Addition
        System.out.println("Subtraction = " + (num1 - num2));     //Subtraction
        System.out.println("Multiplication = " + (num1 * num2));   //Multiplication
        System.out.println("Division = " + (num1 / num2));         //Division
        System.out.println("Modulus = " + (num1 % num2));          //Modulus



        // Just keep remember that the '+' operator is used to connect the Strings or any Data Type

        System.out.println("\n\n=====================================");
        System.out.println("Assignment Operator");
        System.out.println("=====================================");
        // Operator no 2 = Assignment Operator (+=,-=,*=,....)
        // They are used to assing value to variable

        int num3 = 7;

        num3 += 3;
        System.out.println("Here Num 3 is "+ num3);
        System.out.println("After using Assignment Operator num3 += 7 it gives");
        System.out.println(num3);     //it will print 10. It will assign the value of a which is 7 and then adds 3 in it.

        // same for other operations

        //You should try....

        //   num3 -=3;
        //   System.out.println(num3);     //it will print 4. It will assign the value of a which is 7 and then subtracts 3 in it.
        //
        //   num3 *=3;
        //   System.out.println(num3);     //it will print 21. It will assign the value of a which is 7, and then it will multiply by 3.
        //
        //   num3 /=3;
        //   System.out.println(num3);     //it will print 4. It will assign the value of a which is 7, and then it will  divide by 3.



        System.out.println("\n\n=====================================");
        System.out.println("Comparison Operator");
        System.out.println("=====================================");

        // Operator no 3 = Comparison Operator (<,>,!=,==,>=,<=)
        // They are used to compare between two values
        // The output is boolean i.e. true or false

        int num4 = 5;
        int num5 = 6;

        System.out.println(num4 < num5);
        System.out.println(num4 > num5);
        System.out.println(num4 != num5);
        System.out.println(num4 == num5);
        System.out.println(num4 >= num5);
        System.out.println(num4 <= num5);



        System.out.println("\n\n=====================================");
        System.out.println("Logical Operator");
        System.out.println("=====================================");

        // Operator no 4 = Logical Operator (&& (and),|| (or),! (not equal))

        int num6 = 8;
        int num7 = 9;

        System.out.println(num6 <10 && num7 >10);       //It returns false if one of the statement is false

        System.out.println(num6 <12 || num7 > 10);      //It returns true if one of the statement is true

        System.out.println(!(num6 <12 || num7 > 8));    //It returns false because not(!) is used.Reverses the condition.

    }

}
