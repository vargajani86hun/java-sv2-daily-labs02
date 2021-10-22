package day02;

public class Rectangle {
    private double sideA, sideB;

    public Rectangle (double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

}
