package Assignment1;
import java.util.random.RandomGenerator;
public class Prog1 {
    public static void main(String[] args) {

        // RandomGenerator instance
        RandomGenerator rg  = RandomGenerator.getDefault();

        // Get a random integer x in the range 1..9
        int x = rg.nextInt(1,10);

        //Value of π
        double piValue = Math.PI;

        //Get value of π to the power x
        double piToThePowerX = Math.pow(piValue, x);

        // Print the result of piToThePowerX
        System.out.printf("π raised to the power of " + x + " : " + piToThePowerX + "\n");

        // Get a random integer x in the range 1..9
        int y = rg.nextInt(3,14);

        //Get value of π to the power x
        double yToThePowerPi = Math.pow(y, piValue);

        // Print the result of yToThePowerPi
        System.out.printf(y + " raised to the power of π : " + yToThePowerPi);

    }
}
