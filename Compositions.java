package Platter;

public class Compositions {

    public static void main(String[] args) {

        System.out.println("Platter -A");
        PlatterA plattera = new PlatterA(50, 30, 4, 5, 2, 2, 2, 2);
        System.out.println("Total Solid Surface Area : " + plattera.getTotalSolidSurfacearea());
        System.out.println("Total Vackend SurfaceArea : " + plattera.getVackendSurface());
        System.out.println("Inner Boundry : " + plattera.getInnerBoundry());
        System.out.println("Outer Boundry : " + plattera.getOuterBoundry());

        System.out.println("");
        System.out.println("");
        System.out.println("Platter -B");

        PlatterB platterb = new PlatterB(34, 2, 5);
        System.out.println("Total Solid Surface Area : " + platterb.getTotalSolidSurfacearea());
        System.out.println("Total Vackend Surface Area : " + platterb.getVackendSurface());
        System.out.println("Inner Boundry : " + platterb.getInnerBoundry());
        System.out.println("Outer Boundry : " + platterb.getOuterBoundry());
        
        System.out.println("");
        System.out.println("");
        System.out.println("Platter -C");
        PlatterC platterc = new PlatterC(10, 10, 2, 4, 5);
        System.out.println("Total Solid Surface Area : " + platterc.getTotalSolidSurfacearea());
        System.out.println("Total Vackend Surface Area : " + platterc.getVackendSurface());
        System.out.println("Inner Boundry : " + platterc.getInnerBoundry());
        System.out.println("Outer Boundry : " + platterc.getOuterBoundry());

    }
}
