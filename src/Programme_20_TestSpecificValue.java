/*Write a Java program to test if an array contains a specific value.*/
public class Programme_20_TestSpecificValue {

    static void contains(int[] array, int expected) {
        for (int x : array) {
            //if number value is 10 then print
            if (x == expected) {
                System.out.println("Array contains : " + x);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 10, 4, 5, 6};
        contains(array, 10);        // calling method
        contains(array, 50);        // calling method
    }
}
