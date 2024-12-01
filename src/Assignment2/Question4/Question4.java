package Assignment2.Question4;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Enter C for Circle
                    Enter R for Rectangle
                    Enter T for Triangle:
                    """);
            String C = sc.nextLine().trim().toUpperCase();


            switch (C) {
                case "C":
                    System.out.println("Enter Radius:");
                    double radius = Double.parseDouble(sc.nextLine());
                    Circle cr1 = new Circle(radius);
                    double area = cr1.getArea();
                    System.out.println("Area is " + area);
                    break;
                case "R":
                    System.out.println("Enter width:");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter height:");
                    double height = Double.parseDouble(sc.nextLine());
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("Area is " + rectangle.getArea());
                    break;
                case "T":
                    System.out.println("Enter width :");
                    double circleWidth = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter height :");
                    double circleHeight = Double.parseDouble(sc.nextLine());
                    Triangle triangle = new Triangle(circleWidth, circleHeight);
                    System.out.println("Area is " + triangle.getArea());
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println("do you want to continue? (y/n)");
            String answer = sc.nextLine();
            if (answer.equals("n")) {
                break;
            }
        }


    }
}

record Circle(double r) {

    public double getArea() {
        return Math.PI * r * r;
    }

}

record Triangle(double base, double height) {

    public double getArea() {
        return (base * height) / 2;
    }

}

final class Rectangle {

    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
