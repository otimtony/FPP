package Lesson4.Question3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {

    // Test for array with multiple elements
    @Test
    void testReverseArray() {
        int[] arr = {1, 3, 5, 7, 9, 13};
        ReverseArray.reverseArrayHandler(arr);
        assertArrayEquals(new int[]{13, 9, 7, 5, 3, 1}, arr);
    }

    // Test for array with a single element
    @Test
    void testSingleElementArrayReversal() {
        int[] arr = {23};
        ReverseArray.reverseArrayHandler(arr);
        assertArrayEquals(new int[]{23}, arr);
    }

    // Test for reversal of empty array
    @Test
    void testEmptyArrayReversal() {
        int[] arr = {};
        ReverseArray.reverseArrayHandler(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    //Test for reversal of array with odd length
    @Test
    void testArrayWithOddLengthReversal() {
        int[] arr = {3, 5, 6, 9, 13};
        ReverseArray.reverseArrayHandler(arr);
        assertArrayEquals(new int[]{13, 9, 6, 5, 3}, arr);
    }
}