package Lesson4;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(isPalindromeHandler(121));

    }

    public static boolean isPalindromeHandler(int input) {
        String str = String.valueOf(input);
        return checkIfPalindrome(str, 0, str.length() - 1);
    }

    static private boolean checkIfPalindrome(String x, int currentIndex, int targetIndex) {
        if (currentIndex >= targetIndex) {
            return true;
        }

        if (x.charAt(currentIndex) != x.charAt(targetIndex)) {
            return false;
        }
        return checkIfPalindrome(x, currentIndex + 1, targetIndex - 1);
    }
}
