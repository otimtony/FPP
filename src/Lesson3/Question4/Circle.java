package Lesson3.Question4;

record Circle(double r) {

    public double getArea() {
        return Math.PI * r * r;
    }

}