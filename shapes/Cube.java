/*Dillan Poorman
 *CSC205
 *09/06/2019
 *cube class, child class of shape, includes constructor, overload, volume and surface area
 */
package shapes;

public class Cube extends Shape {
	
	private double width;
	
	//constructor
	public Cube(){
		
		this.width = 0.0;
		
	}
		
	//overload
	public Cube(double width){
		
		this.width = width;
	}

	//method compute volume and returns result
	public double volume() {
		
		return Math.pow(this.width, 3);
	}

	//method computes surface area and returns result
	public double surfaceArea() {
		
		return (6 * (Math.pow(this.width, 2)));
	}
	
	//to string method 
	public String toString() {
		
		return ("width{Radius = " + this.width + "}");
	}

}
