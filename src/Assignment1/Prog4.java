package Assignment1;

import org.w3c.dom.ls.LSOutput;

public class Prog4 {

    public static void main(String[] args) {
     String[] inputArray =   {"horse","cat","tiger", "dog", "cat", "horse", "dog", "dog", "cat"};

     StringBuilder uniqueString = new StringBuilder();

        for (int i = 0; i < inputArray.length; i++) {
            boolean isDuplicate  = false;
            for (int j = 0; j <  i; j++) {
                if (inputArray[i].equals(inputArray[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                if(!uniqueString.isEmpty()) {
                    uniqueString.append(",");
                }
                uniqueString.append(inputArray[i]);
            }
        }

        String[] outputArray = uniqueString.toString().split(",");

        System.out.println(java.util.Arrays.toString(outputArray));

    }

}
