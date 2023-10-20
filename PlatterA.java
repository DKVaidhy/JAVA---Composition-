package Platter;

public class PlatterA {

    private Circle circle1;
    private Circle circle2;
    private Rectangle rectangle;
    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;

    public PlatterA(double length, double width, double radius1, double radius2, double side1, double side2, double side3, double side4) {
        circle1 = new Circle(radius1);
        circle2 = new Circle(radius2);
        rectangle = new Rectangle(length, width);
        square1 = new Square(side1);
        square2 = new Square(side2);
        square3 = new Square(side3);
        square4 = new Square(side4);
    }

    public double getTotalSolidSurfacearea() {
        return rectangle.getRectangleArea() - square1.getSquareArea() - square2.getSquareArea() - square3.getSquareArea() - square4.getSquareArea() - circle1.getCircleArea() - circle2.getCircleArea();
    }

    public double getOuterBoundry() {
        return rectangle.getRectanglePerimeter();
    }

    public double getVackendSurface() {
        return square1.getSquareArea() + square2.getSquareArea() + square3.getSquareArea() + square4.getSquareArea() + circle1.getCircleArea() + circle2.getCircleArea();
    }

    public double getInnerBoundry() {
        return square1.getSquareParemeter() + square2.getSquareParemeter() + square3.getSquareParemeter() + square4.getSquareParemeter() + circle1.getCircleCircumference() + circle2.getCircleCircumference();
    }
}
