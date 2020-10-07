package wrasmann_p3;

import java.lang.Math;

public class Sphere extends Shape3D
{
	private double dim1;
	
	public Sphere(double a)
	{
		super("sphere");
		
		this.dim1 = a;
	}

	@Override
	public double getVolume()
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(this.dim1, 3);
	}

	@Override
	public double getArea()
	{
		return 4 * Math.PI * Math.pow(this.dim1, 2);
	}

}
