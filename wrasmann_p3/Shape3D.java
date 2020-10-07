package wrasmann_p3;

public abstract class Shape3D extends Shape
{
	private String name;
	
	public Shape3D(String name)
	{
		super();
		
		this.name = name;
	}
	
	public abstract double getVolume();

	@Override
	public String getName()
	{
		return this.name;
	}

}