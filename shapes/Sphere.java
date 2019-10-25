/*Dillan Poorman
 * CSC205
 * 09/06/2019
 * Sphere class child class of shape. 
 * 
 */
package shapes;

public class Sphere implements Shape {
	
	private double radius;
	
	//constructor
	public Sphere() {
		
		radius = 0;
	}
	
	//overload
	public Sphere(double radius) {
		
		this.radius = radius;
		
	}
	
	//computes volume and returns results
	public double volume() {
		double cons = (double) 4/3;
		return ((cons * Math.PI) * Math.pow(this.radius, 3));
	}
	
	//computer surface area and returns result
	public double surfaceArea() {
		
		return 4 * Math.PI * Math.pow(this.radius, 2) ;
	}
	
	//to string
	public String toString() {
		
		return ("Sphere{Radius = " + this.radius + "}");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
