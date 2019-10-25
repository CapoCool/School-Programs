/*Dillan Poorman
 * CSC205
 * 09/06/2019
 * Driver class for shapes, cylinder, sphere, and cube.
 * 
 */

package shapes;

public class ShapesDriver {

	public static void main(String[] args) {
		
		Cube cube = new Cube(10);
		Sphere sphere = new Sphere(10);
		Cylinder cylinder = new Cylinder(2, 5);
		
		System.out.println(cube);
		System.out.println(sphere);
		System.out.println(cylinder);
		
		System.out.println("Cube\n" + "Surface Area: " + cube.surfaceArea() + "\n" + "Volume: " + cube.volume() + "\n");
		System.out.println("Sphere\n" + "Surface Area: " +  sphere.surfaceArea() + "\n" + "Volume: " + sphere.volume() + "\n");
		System.out.println("Cylinder\n" + "Surface Area: " + cylinder.surfaceArea() + "\n" + "Volume: " + cylinder.volume() + "\n");
		
	}

}
