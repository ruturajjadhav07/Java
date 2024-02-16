// Abstract class.
// Abstract method does nit have body.
// When we extend the abstract class we need to implement the method from the abstract class.

abstract class Bike {

    public abstract void modelName(); // Abstract method.It does not have body.

    public void bikeCompany() {
        System.out.println("Bike Company: XYZ Bikes");
    }
}

class MountainBike extends Bike { // Extending abstract class.

    // Implementing the abstract method
    public void modelName() {
        System.out.println("Model Name: Mountain Explorer");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Creating an object of the MountainBike subclass
        MountainBike mountainBike = new MountainBike();

        // Calling methods
        mountainBike.modelName();
        mountainBike.bikeCompany();
    }
}
