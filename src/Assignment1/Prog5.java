package Assignment1;
import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {

        //Arrays to be combined
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        int[] result = combine(a, b);

        System.out.println(Arrays.toString(result));
    }
    public static int[] combine(int[] a, int[] b) {

        int[] combinedArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            combinedArray[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            combinedArray[a.length + i] = b[i];
        }

        return combinedArray;
    }
}

