package Lesson4.Question4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testIsPalindrome() {

        // Palindrome number
        assertTrue(Palindrome.isPalindrome(121));

        // test number that is not palindrome
        assertTrue(Palindrome.isPalindrome(34213));

        // single digit
        assertTrue(Palindrome.isPalindrome(9));

        // Negative number
        assertTrue(Palindrome.isPalindrome(-112156));

        // large Palindrome
        assertTrue(Palindrome.isPalindrome(986595689));

    }

}