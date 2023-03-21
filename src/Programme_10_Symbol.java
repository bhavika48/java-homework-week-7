import java.util.Scanner;


/*Write a java program to input any two number and ask user to enter their
symbol (+, -,/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
public class Programme_10_Symbol {
    static void printNumber(int number1, int number2, String symbol) {  // logic statement
        if (symbol.equals("+")) {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (symbol.equals("-")) {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (symbol.equals("/")) {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        } else if (symbol.equals("*")) {
            System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter symbol : ");
        String sym = scanner.next();
        printNumber(num1, num2, sym);         //method calling

        scanner.close();
    }
}
