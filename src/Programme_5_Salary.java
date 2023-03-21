import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|*/
public class Programme_5_Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // created an object
        System.out.print("Enter the Employee ID : ");
        int id = s.nextInt();               //variable

        System.out.print("Enter the Employee name : ");
        String name = s.next();

        System.out.print("Enter the Employee year : ");
        double basicSalary = s.nextDouble();

        double hra = (basicSalary * (10.0 / 100));
        double da = basicSalary * (8.0 / 100);
        double ta = basicSalary * (9.0 / 100);
        double pf = basicSalary * (20.0 / 100);
        double grossSalary = basicSalary + hra + da + ta - pf;


        System.out.println("| _________________________________| ");
        System.out.println("|           Salary Slip            |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id    : " + id + "            |");
        System.out.println("| Employee Name  : " + name + "           |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary   : " + basicSalary + "        |");
        System.out.println("| HRA 10%        : " + hra + "             |");
        System.out.println("| TA 8%          : " + ta + "                |");
        System.out.println("| DA 9%          : " + da + "                |");
        System.out.println("| PF - 20&       : " + pf + "             |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary   : " + grossSalary + "        |");
        System.out.println("|===========================    |");

    }
}
