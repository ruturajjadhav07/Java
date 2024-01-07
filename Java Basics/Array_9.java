// Array
// Why we need..?
// Array stores multiple values at one time.We can declare array size as we want.
// Array are indexed based and first element of array is stored at 0th index.
// Size of array starts from 1.

// Array are created using [].

public class Array_9 {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("===================================");

        System.out.println("Changing array values and fetching ");

        int[] array2 = {1, 2, 3, 4, 5, 6};

        System.out.println(array2[0]);   // Fetching single value using array index.

        System.out.println("The value of index 1 in arrar2 is " + array2[1]);
        array2 [1] = 9;
        System.out.println("After changing value of index 1 in arrar2 is " + array2[1]);

        
        System.out.println("**********************************");


        System.out.println("\n===================================");
        System.out.println("===================================");
        System.out.println("Assigning multiple values to array");

        // Assigning values and declaring int array.
        int[] array = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("**********************************");
        System.out.println("\n===================================");
        System.out.println("===================================");


        // Declaring Array size
        System.out.println("Declareing array size");
        int[] array1 = new int[3];                                // size Declaring.it is declared in []

        // If we add more than 3 elements it will give error.
        // It stores number of element declared in array.
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("**********************************");


        System.out.println("\n===================================");
        System.out.println("===================================");


        // Mutidimensional Array

        // They are used to save multidimensional array
        // They are create usng [] []
        // The first [] outer layer and second [] is inner layer
        // We use two loop i.e. first outer loop and second inner loop

        System.out.println("Multidimensional array");
        int[][] multi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multi[i][j] + " ");
                // used print for printing one after one in matrixs
                // if used println it will print one by one in serial
            }
            System.out.println();
            // it goes to next line after printing one array row
        }

        // Output
        // 1 2 3
        // 4 5 6
        // 7 8 9

        System.out.println("**********************************");


        System.out.println("\n===================================");
        System.out.println("===================================");

        // declaring multidimensional array
        System.out.println("Declaring multidimensional array");
        int[][] multi1 = new int[3][4];
        multi1[0][0] = 2;
        multi1[1][1] = 5;
        multi1[2][2] = 8;
        multi1[0][3] = 11;
        multi1[1][0] = 14;
        multi1[2][1] = 17;
        multi1[0][2] = 20;
        multi1[1][3] = 23;
        multi1[2][0] = 26;
        multi1[0][1] = 29;
        multi1[0][2] = 32;
        multi1[0][3] = 35;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multi1[i][j] + " ");
            }
            System.out.println();
        }

        // [3][4] means 3 rows and 4 columns
        //      [0] [1] [2] [3]
        //[0]    2  29   32  35
        //[1]   14   5   0   23
        //[2]   26  17   8   0

        System.out.println("**********************************");

        System.out.println("\n===================================");
        System.out.println("===================================");

        System.out.println("Using math function");
        int[][] multi2 = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int numbers = (int) (Math.random() * 10);          // Type casting.Using math function for random numbers
                multi2[i][j] = numbers;
                System.out.print(multi2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("**********************************");
        System.out.println("===================================");
        System.out.println("===================================");

    }
}
