/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Programme_8_AlphabetCity {
    static void findCityName(String alphabet) {

        if (alphabet == "a") {              //logic statment
            System.out.println("City Name : Ahmedabad");
        } else if (alphabet == "b") {
            System.out.println("City Name : Baroda");
        } else if (alphabet == "c") {
            System.out.println("City Name : Canada");
        } else if (alphabet == "d") {
            System.out.println("City Name : Dangra");
        } else if (alphabet == "e") {
            System.out.println("City Name : Eric");
        } else if (alphabet == "f") {
            System.out.println("City Name : France");
        } else {
            System.out.println("invalid entry");
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