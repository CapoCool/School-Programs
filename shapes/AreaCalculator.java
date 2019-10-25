package shapes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
	
	public static void main(String[] args) {
		
		DecimalFormat form = new DecimalFormat("0.0000");
		
		Shape square = new Square(8.0);
		Shape rectangle = new Rectangle(10.0, 4.0);
		Shape circle = new Circle(5.0);
		Shape triangle = new Triangle(4, 7);
		Shape cylinder = new Cylinder(5, 10);
		

		List<Shape> shape = new ArrayList<Shape>();
		
		shape.add(square);
		shape.add(rectangle);
		shape.add(circle);
		shape.add(triangle);
		shape.add(cylinder);
		
		
		for(Shape sha : shape) {
			
			System.out.print(sha + "\n");
			
		}
		
		System.out.println("Total Area = " +form.format(square.calculateArea() + rectangle.calculateArea() + circle.calculateArea() + triangle.calculateArea() 
							+ ((Cylinder) cylinder).surfaceArea()) + "\nThe volume of a cylinder is: " + (form.format(((Cylinder) cylinder).volume())));
	}

}
