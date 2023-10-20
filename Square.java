package Platter;

public class Square {

    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public double getSquareArea() {
        return side * side;
    }

    public double getSquareParemeter() {
        return 4 * side;
    }
}
