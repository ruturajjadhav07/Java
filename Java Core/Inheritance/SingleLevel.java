// Inheritance
// It has ability to inherit other class operations.
// It is created by class keyword.
// The first class is know as base class or parent class.
// The class created from base class is called derived class or subclass.It is done by extend keyword.
// By inheriting classes we can reuse code.
// It allows to perform multiple operations.
// Types are single level,multi level,hierarchical


//Remember if we create class inside main file (class file name) first we need to create instance of main class file and then next of our created class.


//Single level Inheritance
// When one class inherits another it is called single inheritance

class Game {                             // Base class
    String GameName = "Vice City";
}

class GameOwner extends Game {           // Inherting the class Game in Class GameOwner
    String Owner = "Gta";
}


public class SingleLevel {

    public static void main(String[] args) {
        GameOwner game = new GameOwner();      // Creating object of GameOwner to access values of class Game and GameOwner
        System.out.println("**********************************************************");
        System.out.println("Single level Inheritance");
        System.out.println("Game name : " + game.GameName + ".\nOwner Name : " + game.Owner);
        System.out.println("**********************************************************");
    }
}
