package CSC205;

import java.text.DecimalFormat;

public class PointTester {

    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.000");
        System.out.println("Cartesian Plane Point Tester\n");

        Point a = new Point(3.0, 1.0);
        Point b = new Point();
        b.setPoint(6.0, 5.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        System.out.println("\nDistance: " + fmt.format(a.distance(b)));
        Point b2 = new Point(b.getX(), b.getY());
        b.shiftX(4);
        b.shiftY(-2);
        System.out.println("Shifted b " + fmt.format(b.distance(b2)) + " away from original position: " + b);

    }
} 

/*
Cartesian Plane Point Tester

Point 1: Point{x = 3.0, y = 1.0}
Point 2: Point{x = 6.0, y = 5.0}

Distance: 5.000
Shifted b 4.472 away from original position: Point{x = 10.0, y = 3.0}
*/