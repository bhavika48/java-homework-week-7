/*
. Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Programme_1_OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//create an object
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // if <condition> ? Yes : No;

        String check = (num % 2 == 0) ? "even" : "odd"; //Use ternary to check
        System.out.println("The entered number " + num + " is " + check);
        sc.close();

    }
}
