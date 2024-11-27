package Assignment1;
public class Prog6 {
    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(a);
    }

    public static void secondMin(int[] a) {

        if (a == null || a.length < 2) {
            System.out.println("Array must have at least two elements");
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < firstMin) {
                secondMin = firstMin;
                firstMin = a[i];
            } else if (a[i] < secondMin && a[i] != firstMin) {
                secondMin = a[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second min val.");
        } else {
            System.out.println("Second min val: " + secondMin);
        }
    }
}

