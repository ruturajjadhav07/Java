// Encapsulation.
// Encapsulation means binding data together and making in secure.
// for eg Tablet (it has many mixtures of chemicals)
// We can encapsulate means can make private variables in class or methods
// Therefore it make unavailable to access varaibles from outside.
// We can access those variables using getter setter method.

class Bio{
    private int Age;                  // Private age instance
    private String Name;              // Private Name instance

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
//        obj.Age = 19;
//        obj.Name = "Harry";

        System.out.println(obj.getName());   // Acceessing from setname using getname method
        System.out.println(obj.getAge());    // Accessing from setage sing getage method
    }
}

