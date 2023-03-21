
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

import java.util.Scanner;

public class Programme_3_MarkSheet {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // input variables
        System.out.print("Enter Name : ");
        String name = s.next();

        System.out.print("Enter roll number : ");
        int rollNum = s.nextInt();

        System.out.print("Enter Maths marks : ");
        int mathsMarks = s.nextInt();

        System.out.print("Enter English marks : ");
        int englishMarks = s.nextInt();

        System.out.print("Enter Science : ");
        int scienceMarks = s.nextInt();

        System.out.print("Enter the Employee ID : ");
        String result = "";
        String grade = "";
        //find out total, percentage and result

        int total = (englishMarks + mathsMarks + scienceMarks);
        System.out.println(total);
        // (totalMarks/numberOfSubject)
        double percentage1 = 75;//total/ 3;
        System.out.println(percentage1);

        //(pass>=35)
        if (percentage1 >= 35) {
            System.out.println("Result : Pass");
            result = "Pass";
            if (percentage1 >= 80) {
                System.out.println("Grade : A+");
                grade = "A+";
            } else if (percentage1 >= 60) {
                System.out.println("Grade : A");
                grade = "A";
            } else if (percentage1 >= 50) {
                System.out.println("Grade : B");
                grade = "B";
            } else if (percentage1 >= 35) {
                System.out.println("Grade : C");
                grade = "C";
            }
        } else {
            System.out.println("Fail");
            result = "Fail";
        }

        System.out.println("|                               |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("| Name : " + name + "           |");
        System.out.println("| Roll No: " + rollNum + "      |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks              |");
        System.out.println("|_______________________________|");
        System.out.println("| Math : " + mathsMarks + "     |");
        System.out.println("| Science : " + scienceMarks + "|");
        System.out.println("| English : " + englishMarks + " |");
        System.out.println("|_______________________________|");
        System.out.println("| Total : " + total + "         |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage : " + percentage1 + "|");
        System.out.println("| Result : " + result + "        |");
        System.out.println("| Grade : " + grade + "         |");
        System.out.println("|_______________________________|");
    }
}
