/*
 * Name: Point.java
 * Author: Dillan Poormna
 * Class: CSC205
 * Date: 08/25/2019
 * Description: Represents a location on a Cartesian plane
 */

package CSC205;

public class Point {
	
	private double x;
	private double y;
	
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		
		return this.x;
	}
	
	public double getY() {
		
		return this.y;
		
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setPoint(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void shiftX(double x) {
		
		this.x += x;
	}
	
	public void shiftY(double y) {
		
		this.y += y;
	}
	
	public double distance(Point p) {
		double d;
		
		d = Math.sqrt((Math.pow((this.x - p.getX()), 2) + (Math.pow((this.y - p.getY()), 2))));
		
		return d;
	}
	
	public String toString() {
		
		return ("Point{x = " + this.getX() + ", y = " + this.getY() + "}");
	}
	
	

}
