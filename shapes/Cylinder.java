/*Dillan Poorman
 * CSC205
 * 9/06/2019
 * Cyclinder class, child class of shape. Inludes constructor, overload, volume, and surface area
 * 
 */
package shapes;

public class Cylinder extends Circle {
	
	private double height;
	
	//constructor
	public Cylinder() {
		
		super();
	}
	
	
	//overload method
	public Cylinder(double radius, double height) {
		
		this.radius = radius;
		this.height = height;
		
	}
	
	//method that computes volume and returns the result
	public double volume() {
		
		return Math.PI * Math.pow(this.radius, 2) * this.height;
	}
	
	//method that computes surface area and reutrn the result
	public double surfaceArea() {
		
		return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this.radius, 2));
	}
	
	//to string method
	public String toString() {
		
		return("Cylinder [Radius = " + this.radius + ", Height = " + this.height + " base perimeter=" + form.format(this.calculatePerimeter()) + " Surface Area=" + form.format(this.surfaceArea()) + "]");
	}

}
