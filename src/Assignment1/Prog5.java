package Assignment1;

public class Prog5 {

    public static void main(String[] args) {
        int[] input1 = {5,6,-4,3,1};
        int[] input2 =  { 3,8,9,11};


        int[] output = combine(input1, input2);


        System.out.println(java.util.Arrays.toString(output));
    }

    public static int[] combine(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        int i = 0;
        for ( ; i < a.length; i++) {
            output[i] = a[i];
        }

        for ( ; i < a.length + b.length; i++) {
            output[i] = b[i- a.length];
        }

        return output;

    }
}
