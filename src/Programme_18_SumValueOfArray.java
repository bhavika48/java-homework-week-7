/*Write a Java program to sum values of an array.*/
public class Programme_18_SumValueOfArray {
    public static void main(String[] args) {
        int x[] = {5, 5, 4, 4, 1, 1, 10, 10};
        int sum = 0;

        for (int i : x) {
            sum += i;
        }
        System.out.println("The total value of sum : " + sum);
    }
}
