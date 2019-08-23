package ch4;

public class Circle
{
  private double radius;

  public Circle( )
  { radius = 0.0; }

  public Circle(double r )
  { radius = r; }

  public Circle(int i, int j) {
	// TODO Auto-generated constructor stub
}

public double calculate( ) //this calculates the area
  { return (Math.PI * Math.pow(radius , 2)); }

 public String toString( )
  { return (" radius = " + radius ); }

}