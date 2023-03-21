import java.util.Scanner;

/*Write a program that tells us input value is number or an alphabet or symbol*/
public class Programme_12_InputValue {
    static void findText(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { //logic statment
            System.out.println(ch + " is a alphabet ");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a number ");
        } else {
            System.out.println(ch + " is a symbol ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text : ");
        char ch = scanner.next().charAt(0);
        findText(ch);// calling method
        scanner.close();

    }
}
