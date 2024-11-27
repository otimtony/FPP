package Assignment1;

public class Prog6 {

    public static void secondMin(int[] inputArr) {

        int firstSmallestNum = inputArr[0];
        int secondSmallestNum = inputArr[1];

        for (int i = 2; i<inputArr.length; i++) {
            if (inputArr[i] < firstSmallestNum) {
                secondSmallestNum = firstSmallestNum;
                firstSmallestNum = inputArr[i];

            } else if ((inputArr[i] < secondSmallestNum) && (inputArr[i] > firstSmallestNum)) {
                secondSmallestNum = inputArr[i];

            }
        }

        System.out.println(Math.max(firstSmallestNum, secondSmallestNum));

    }
    public static void main(String[] args) {

        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        secondMin(a);

    }
}
