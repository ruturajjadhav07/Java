// Encapsulation.
// Encapsulation means binding data together and making in secure.
// for eg Tablet (it has many mixtures of chemicals)
// We can encapsulate means can make private variables in class or methods
// Therefore it make unavailable to access varaibles from outside.
// We can access those variables using getter setter method.

class Bio{
    private int Age;                  // Private age instance
    private String Name;              // Private Name instance

    // So as we read above the variables are private therefore we use getter setter method to access them.
    
    public String getName(){          // using get to return name
        return Name;
    }

    public void setName(String name){ // setting Name to give name value
        Name = name;
    }
    public int getAge(){              // using get to return age
        return Age;
    }

    public void setAge(int age){      // setting Age to give age value
        Age = age;
    }
}

public class encpsulation {
    public static void main(String[] args) {
        Bio obj = new Bio();

        obj.setName("Warner");         // setting name using setname method
        obj.setAge(33);                // setting age using setname method

        // Attempting to directly access private variables would cause an error
        // obj.Age = 19;    
        // obj.Name = "Harry";

        System.out.println(obj.getName());   // Acceessing from setname using getname method
        System.out.println(obj.getAge());    // Accessing from setage sing getage method
    }
}




// Explanation:

// The Bio class has private variables Age and Name, restricting direct access from outside the class.

// Public getter and setter methods (getName(), setName(), getAge(), setAge()) are provided to access and modify these private variables, respectively.

// In the main method of the Encapsulation class, an object obj of the Bio class is created and then its attributes are set using the setter methods.

// Accessing the private variables directly (obj.Age or obj.Name) from outside the class will result in an error due to their private visibility.

