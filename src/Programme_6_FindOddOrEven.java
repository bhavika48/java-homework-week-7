import java.util.Scanner;

/*Write a java program to input any number and find out if it’s odd or even*/
public class Programme_6_FindOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//create an object
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        scanner.close();


    }
}
