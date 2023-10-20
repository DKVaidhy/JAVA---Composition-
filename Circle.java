package Platter;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return PI * radius * radius;
    }

    public double getCircleCircumference() {
        return 2 * PI * radius;
    }
}
