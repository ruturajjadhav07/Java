// Method Overloading.
// Method Overloading is useful when we have multiple methods with same name in class.
// It can have same method name but different number of parameters inside it.
// Methods can be created using different data type but should have different number of parameters and defined data types in it.


class Overloading {                                 // Creating class
    public int num(int num1, int num2, int num3) {   // public method with name num. it have 3 parameters
        return num1 + num2 + num3;
    }

    public int num(int num1, int num2) {             // Another public name with same name as name but 2 parameters.
        return num1 + num2;
    }

    // In above two methods if method name, data type and number of parameters are same it will give error.
    // Therefore it should have different number of parameters for every method created with same data type and name.


    // using different data type
    public float num(float num1, float num2) {          // float data type is used and 2 parameters are there defined as float
        return num1 + num2;
    }

}


public class MethodOverloading {

    public static void main(String[] args) {
        Overloading obj = new Overloading();         // Creted object of class Overloading.

        // Here we can call the method we created and it takes the input as we given in method.
        System.out.println("The sum of first method is " + obj.num(3, 5, 8));
        System.out.println("The sum of first method is " + obj.num(3, 5));
        System.out.println("The sum of first method is " + obj.num(4.5f, 5.5f));
    }
}

