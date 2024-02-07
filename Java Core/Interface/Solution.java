interface Name {    // Interface Declared

    // String name1; // It gives error.Because all variables declared inside
    // interface are final and static.
  
    String s1 = "rutu"; // It is now final and static.

    public void greet();  // returns nothing as we use void.

    public void name();   // returns nothing as we used void.
}

interface Say { // Say what you want 😅😅

    void say();
}

class Greet implements Name, Say { // One class can implements many interface.
    public void greet() {
        System.out.println("Hello");
    }

    public void name() {
        System.out.println("Ruturaj");
    }

    public void say() {
        System.out.println("How are you");
    }
}

public class Solution {

    public static void main(String[] args) {

        Name n1 = new Greet();
        n1.greet();
        n1.name();

        System.out.println(Name.s1); // As variable declared inside in static and final.There is no need to declare
        // object to access value.

        Say say = new Greet(); // We create new object of Say.Because interface Name has only two methods greet
        // and name.It don't know anything about so there is need to create a another
        // object for.
        say.say();
    }
}
