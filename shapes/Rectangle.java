package shapes;

import java.text.DecimalFormat;

public class Rectangle implements Shape {
	
	protected double length;
	protected double width;
	
	DecimalFormat form = new DecimalFormat("0.00");
	
	public Rectangle() {
		
		length = 0.00;
		width = 0.00;
		
	}
	
	public Rectangle (double length, double width) {
		
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return this.width * this.length;
	}

	@Override
	public double calculatePerimeter() {
		
		return 2 * (width + length);
	}
	
	public String toString() {
		return ("Rectangle [length=" + this.length + " width=" + this.width + " perimeter=" + form.format(this.calculatePerimeter()) + " area=" + form.format(this.calculateArea()) + "]");
	}

}
