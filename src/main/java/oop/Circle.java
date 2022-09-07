package oop;

public class Circle {
    private static final double PI = Math.PI;
    private int radius;
    private double square;
    private double lenghtCircle;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getSquare() {
        square = Math.pow(radius, 2) * PI;
        return square;
    }

    public double getLenghtCircle() {
        lenghtCircle = 2 * PI * radius;
        return lenghtCircle;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getSquare());
        System.out.println(circle.getLenghtCircle());

    }
}
