package Assignment3;

public class Prog1 {

    public static void main(String[] args) {
        System.out.println(findPow(5, 5));
    }

    static int findPow(int x, int pow) {
        if (pow == 0) return 1;

        if (pow == 1) return x;

        return x * findPow(x, pow - 1);
    }
}
