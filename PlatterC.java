package Platter;

public class PlatterC {

    private Rectangle rectangle;
    private Circle innerCircle1;
    private Circle innerCircle2;
    private Circle innerCircle3;

    public PlatterC(double length,double width, double radius1,double radius2, double radius3) {
        rectangle = new Rectangle(length,width);
        innerCircle1 = new Circle(radius1);
        innerCircle2 = new Circle(radius2 );
        innerCircle3 = new Circle(radius3 );
    }

    public double getTotalSolidSurfacearea() {
        return rectangle.getRectangleArea() -innerCircle1.getCircleArea() - innerCircle2.getCircleArea()-innerCircle2.getCircleArea();
    }

    public double getOuterBoundry() {
        return rectangle.getRectangleArea();
    }

    public double getVackendSurface() {
        return innerCircle1.getCircleArea() +innerCircle2.getCircleArea()+innerCircle3.getCircleArea();
    }

    public double getInnerBoundry() {
        return innerCircle1.getCircleCircumference() +innerCircle2.getCircleCircumference()+innerCircle3.getCircleCircumference();
    }
}

