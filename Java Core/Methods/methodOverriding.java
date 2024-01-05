// Method Overriding.
// The sub class should have same name as it is given in Parent class.
// Method Overriding is used for run time polymorphism.


class A3 {
    public void show(){
        System.out.println("In A3 show");
    }
    public void config(){
        System.out.println("Still in A3");
    }

}

class B3 extends A3{
    public void show(){   // if show1() method is written it will write "in A show"
                          // if show() method is written is used it will override the method of class A(show()))
                          // and write "In B show" the method of class B
        System.out.println("In B3 show");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.show();               // prints "In B show". It overrides the method show() present in class A
        obj.config();             // prints "Still in A"
    }

}


// Just do minor change in Class B for output.
// 1) run with public void show()
// 2) run with public void show1()
