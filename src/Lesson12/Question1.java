package Lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a valid integer between 0 and 100: ");

            if (!input.hasNextInt()) {
                throw new InputMismatchException("Input Should be a valid integer");
            }

            int intVal = input.nextInt();

            if (intVal < 0 || intVal > 100) {
                throw new UnsupportedOperationException("Input not in range");
            }

            System.out.println("Valid input: " + intVal);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException Error: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException Error: " + e.getMessage());
        } finally {
            input.close();
        }

    }
}
