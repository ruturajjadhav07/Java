// Inheritance
// It is part of OOPS
// It has ability to inherit other class operations.
// It is created by class keyword.
// The first class is know as base class or parent class.
// The class created from base class is called derived class or subclass.It is done by extend keyword.
// By inheriting classes we can reuse code.
// It allows to perform multiple operations.
// Types are single level,multilevel,hierarchical,multiple

//Remember if we create class inside main file (class file name) first we need to create instance of main class file and then next of our created class.


//Single level Inheritance
// When one class inherits another it is called single inheritance

// Imagine you have a video game
class Game {                             // Base class
    String gameName = "Vice City";       // Attribute: name of the game
}

// Now, let's create a class for the game owner, which inherits from the Game class
class GameOwner extends Game {           // Inheriting the Game class in GameOwner class
    String owner = "Gta";                // Attribute: owner of the game
}

public class SingleLevel {

    public static void main(String[] args) {
        GameOwner game = new GameOwner();  // Creating an object of GameOwner to access values of Game and GameOwner
        System.out.println("**********************************************************");
        System.out.println("Single level Inheritance");
        System.out.println("Game name: " + game.gameName + ".\nOwner Name: " + game.owner);
        System.out.println("**********************************************************");
    }
}

