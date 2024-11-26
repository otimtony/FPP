package Assignment1;

import java.util.random.RandomGenerator;

public class Prog1 {
    public static void main(String[] args) {
        RandomGenerator rg  = RandomGenerator.getDefault();
        double x = rg.nextDouble(1,10);
        double piValue = Math.PI;
        double piToThePowerX = Math.pow(x, piValue);
        System.out.println("(π raised to the power of x):" + piToThePowerX);


        double y = rg.nextDouble(3,14);
        double yToThePowerPi = Math.pow(y, piValue);
        System.out.println("(y raised to the power of π): " + yToThePowerPi);
    }
}
