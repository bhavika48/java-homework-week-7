import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and
        then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
< 10,000 2%*/
public class Programme_7_Commission {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // created an object
        System.out.print("Enter the sales ID : ");
        int sid = s.nextInt();
        System.out.print("Enter the seller name : ");
        String sName = s.next();
        System.out.print("Enter the sales amount : ");
        double salesAmount = s.nextDouble();
        s.close();

        double commission;

        if (salesAmount >= 50000) {                 //logic
            commission = salesAmount * (35.0 / 100);
        } else if (salesAmount >= 30000) {
            commission = salesAmount * (20.0 / 100);
        } else if (salesAmount >= 20000) {
            commission = salesAmount * (10.0 / 100);
        } else if (salesAmount >= 1000) {
            commission = salesAmount * (5.0 / 100);
        } else {
            commission = salesAmount * (2.0 / 100);
        }

        System.out.println("Sales id : " + sid);
        System.out.println("Seller Name : " + sName);
        System.out.println("Sales Amount : " + salesAmount);
        System.out.println("Calculate commission : " + commission);
    }
}
