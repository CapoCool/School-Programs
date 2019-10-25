package shapes;

import java.text.DecimalFormat;

public class Square extends Rectangle {
	
	DecimalFormat form = new DecimalFormat("0.00");
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		
		this.width = side;
		this.length = side;
		
	}
	
	public String toString() {
		return ("Square [side=" + this.width + " perimeter=" + form.format(this.calculatePerimeter()) + " area=" + form.format(this.calculateArea()) + "]");
	}
	
	

}
