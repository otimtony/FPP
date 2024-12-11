package Lesson4.Question4;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) return false;
        return isPalindromeHelper(num, 0, num);
    }
    private static boolean isPalindromeHelper(int num, int reversedNum, int originalNum) {

        if (num == 0) {
            return reversedNum == originalNum;
        }

        int lastDigit = num % 10;
        reversedNum = reversedNum * 10 + lastDigit;
        System.out.println(reversedNum);

        return isPalindromeHelper(num / 10, reversedNum, originalNum);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11211));
    }

}
