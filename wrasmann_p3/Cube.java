package wrasmann_p3;

public class Cube extends Shape3D
{
	private double dim1;
	
	public Cube(double a)
	{
		super("cube");
		
		this.dim1 = a;
	}

	@Override
	public double getVolume()
	{
		return this.dim1 * this.dim1 * this.dim1;
	}

	@Override
	public double getArea()
	{
		return 6 * this.dim1;
	}

}
