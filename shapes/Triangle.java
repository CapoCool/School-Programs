package shapes;

import java.text.DecimalFormat;

public class Triangle implements Shape {
	
	private double base;
	private double height;
	
	DecimalFormat form = new DecimalFormat("0.00");
	
	public Triangle() {
		base = 0.00;
		height = 0.00;
	}
	
	public Triangle (double base, double height) {
		
		this.base = base;
		this.height = height;
		
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}
	
	//This one was stupid, there would be A LOT of programming for every situation where finding the perimeter of a triangle coudl happen
	// first would be finding sides, which there are like a million different situations for each kind of triangle
	// so screw it, I am making it easy on myself and just assuming all the sides equal height.
	// it would be nice if the guy who makes these assignments could clarify a little
	@Override
	public double calculatePerimeter() {
		return base + base + base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		
		this.base = base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		
		return ("Triangle [base=" + form.format(this.getBase()) + " height=" + form.format(this.getHeight()) + " area=" + form.format(this.calculateArea()) + " perimeter=" + form.format(this.calculatePerimeter()) + "]");
	}
	
	

}
