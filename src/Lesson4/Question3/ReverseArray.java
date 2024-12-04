package Lesson4.Question3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
      int[] input = {1, 3, 5, 7, 9, 13, 15};
        System.out.println(Arrays.toString(reverseArrayHandler(input)));
    }

    public static int[] reverseArrayHandler(int[] arr) {

        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        }
        return reverseArray(arr, 0, arr.length - 1);
    }

   private static int[] reverseArray(int[] input, int startingIndex, int targetIndex) {
        if (startingIndex == targetIndex || startingIndex > targetIndex) {
            return input;
        }
        int temp = input[startingIndex];
        int temp2 = input[targetIndex];
        input[startingIndex] = temp2;
        input[targetIndex] = temp;
        return reverseArray(input, startingIndex + 1, targetIndex - 1);

    }


}
