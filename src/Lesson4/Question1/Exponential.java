package Lesson4.Question1;

public class Exponential {

    public static void main(String[] args) {
        System.out.println(findPow(5, 5));
    }

    static double findPow(double x, int pow) {
        if (pow == 0) return 1;

        if (pow == 1) return x;

        return x * findPow(x, pow - 1);
    }
}
