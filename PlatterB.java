package Platter;

public class PlatterB {

    private Circle circle;
    private Circle innerCircle1;
    private Circle innerCircle2;

    public PlatterB(double radius1, double radius2, double radius3) {
        circle = new Circle(radius1);
        innerCircle1 = new Circle(radius2);
        innerCircle2 = new Circle(radius3 );
    }

    public double getTotalSolidSurfacearea() {
        return circle.getCircleArea() -innerCircle1.getCircleArea() - innerCircle2.getCircleArea();
    }

    public double getOuterBoundry() {
        return circle.getCircleArea();
    }

    public double getVackendSurface() {
        return innerCircle1.getCircleArea() +innerCircle1.getCircleArea();
    }

    public double getInnerBoundry() {
        return innerCircle1.getCircleCircumference() +innerCircle2.getCircleCircumference();
    }
}

