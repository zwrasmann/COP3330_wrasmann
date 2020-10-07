package wrasmann_p3;
import java.lang.Math;

public class Circle extends Shape2D
{
	private double dim1;
	
	public Circle(double a)
	{
		super("circle");
		
		this.dim1 = a;
	}

	@Override
	public double getArea()
	{
		return Math.PI * this.dim1 * this.dim1;
	}

}
