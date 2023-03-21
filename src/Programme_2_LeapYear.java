import java.util.Scanner;

/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?*/
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // created an object
        System.out.print("Enter the year : ");
        int year = s.nextInt();               //// year declaration and initialization

        if ((year % 4 == 0) && (year % 100 != 0)) {         //check leap year
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        s.close();
    }
}
