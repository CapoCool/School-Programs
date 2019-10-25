package shapes;

import java.text.DecimalFormat;

public class Circle implements Shape {
	
	protected double radius;
	DecimalFormat form = new DecimalFormat("0.00");
	
	public Circle() {
		
		radius = 0.00;
		
	}
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double getRadius() {
		
		return this.radius;
	} 
	
	public void setRadius( double radius) {
		
		radius = this.radius;
		
	}
	
	@Override
	public double calculateArea() {
		
		return Math.PI * (Math.pow(this.getRadius(), 2));
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.getRadius();
	}
	
	public String toString() {
		
		return ("Circle [radius=" + form.format(this.getRadius()) + " perimeter=" + form.format(this.calculatePerimeter()) + " area=" + form.format(this.calculateArea()) + "]");
	}
	
	
	

}
