package Lesson4.Question2;

public class MinCharacter {

    public static void main(String[] args) {
        String str = "akel";

        System.out.println(findMinCharacterHandler(str));
    }

    public static Character findMinCharacterHandler(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        return findMinCharacter(str, 0, 'z');
    }

    private static Character findMinCharacter(String str, int pos, Character ch) {

        if (pos == str.length()) {
            return ch;
        }
        if (str.charAt(pos) < ch) {
            ch = str.charAt(pos);
        }

        return findMinCharacter(str, pos + 1, ch);
    }


}
