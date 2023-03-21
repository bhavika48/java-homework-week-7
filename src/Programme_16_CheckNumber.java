/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/

import java.util.Scanner;

public class Programme_16_CheckNumber {
    public static void checkNumber(int num) {
        //check if number is positive, negative or zero
        if (num > 0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if (num < 0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }

    public static void main(String args[]) {
        // create some number values
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no1 = s.nextInt();
        // invoke function
        checkNumber(no1);

    }
}
