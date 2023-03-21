import java.util.Arrays;

/*. Write a Java program to sort a numeric array and a string array.*/
public class Programme_17_NumericArray {

    static void sortIntArray(int[] a) {
        System.out.println("Actual numeric Array :" + Arrays.toString(a));
        Arrays.sort(a);                 //logic statement
        System.out.println("sorted numeric Array :" + Arrays.toString(a));
    }

    static void sortStringArray(String[] b) {
        System.out.println("Actual string Array :" + Arrays.toString(b));
        Arrays.sort(b);                 //logic statement
        System.out.println("Sorted string Array :" + Arrays.toString(b));
    }

    public static void main(String[] args) {
        int[] a = {70, 90, 80, 10, 50, 200, 100}; //created numeric Array
        String b[] = {"John", "Anna", "Cate", "Matt", "Lisa", "Dil", "Viena"};//created string Array
        sortIntArray(a);        // calling method
        sortStringArray(b);
    }
}
