package Assignment3;

public class Prog5 {

    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(findMaxFromTheArrayHandler(arr));
    }

    public static int findMaxFromTheArrayHandler(int[] inputArr) {
        if(inputArr == null || inputArr.length == 0){
            throw new IllegalArgumentException("Input array is null or empty");
        }

        return findMaxFromTheArray(inputArr, 0, Integer.MAX_VALUE);

    }

    private static int findMaxFromTheArray(int[] inputArr, int index, int max) {
        if(inputArr.length == 1){
            return inputArr[0];
        }

        if(index == inputArr.length){
            return max;
        }
        return findMaxFromTheArray(inputArr, index + 1, Math.max(inputArr[index], max));
    }
}
