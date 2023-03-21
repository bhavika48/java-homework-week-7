/*Write a Java program to calculate the average value of array elements.*/
public class Programme_19_CalculateValueOfArray {
    public static void main(String[] args) {
        int num[] = {5, 10, 15, 20}; //created Arryas
        int sum = 0;
        for (int i = 0; i < num.length; i++) { //sum of Arrays
            sum = sum + num[i];
        }
        double average = sum / num.length;  //average value
        System.out.println("Average value is : " + average);

    }
}
