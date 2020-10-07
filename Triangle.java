package wrasmann_p3;

public class Triangle extends Shape2D
{
	private double dim1;
	private double dim2;
	
	public Triangle(double a, double b)
	{
		super("triangle");
		
		this.dim1 = a;
		this.dim2 = b;
	}

	@Override
	public double getArea()
	{
		return 0.5 * this.dim1 * this.dim2;
	}

}