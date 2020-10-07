package wrasmann_p3;

import java.lang.Math;

public class Pyramid extends Shape3D
{
	private double dim1;
	private double dim2;
	private double dim3;
	
	public Pyramid(double a, double b, double c)
	{
		super("pyramid");
		this.dim1 = a;
		this.dim2 = b;
		this.dim3 = c;
	}

	@Override
	public double getVolume()
	{
		return (1.0 / 3.0) * this.dim1 * this.dim2 * this.dim3;
	}

	@Override
	public double getArea()
	{
		return (Math.sqrt(Math.pow(this.dim3, 2.0) + Math.pow(this.dim2 / 2.0, 2.0)) * this.dim1) + (Math.sqrt(Math.pow(this.dim3, 2.0) + Math.pow(this.dim1 / 2.0, 2.0)) * this.dim2) + (this.dim1 * this.dim2);
	}

}
