package wrasmann_p3;

public class Square extends Shape2D
{
	private double dim1;
	
	public Square(double a)
	{
		super("square");
		
		this.dim1 = a;
	}

	@Override
	public double getArea()
	{
		return this.dim1 * this.dim1;
	}

}
