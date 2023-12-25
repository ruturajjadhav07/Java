// Switch statement is used when there are multiple if else conditions.
// It executes the one statement from multiple statements or conditions.
// Break is used when the statement/condition matches the required condition.
// If it doesn't match it will go for default. 

public class Switch_8 {
    public static void main(String[] args) {

        int num = 3;                           // Here you can give condition
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");      //if none of the case is executed it will go for default case.
        }
    }
}
