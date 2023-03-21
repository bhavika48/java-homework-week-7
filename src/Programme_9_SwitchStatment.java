import java.util.Scanner;

/*Same as above program-8 using switch statement.*/
public class Programme_9_SwitchStatment {
    static void findCityName(String alphabet) {
        switch (alphabet) {             //switch statement
            case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("canada");
                break;
            case "d":
                System.out.println("dangra");
                break;
            case "e":
                System.out.println("Eric");
                break;
            case "f":
                System.out.println("France");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alphabet : ");
        String alphabet = scanner.next();
        findCityName(alphabet);     // method calling
        scanner.close();
    }

}