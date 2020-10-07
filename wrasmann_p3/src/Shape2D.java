package wrasmann_p3;

public abstract class Shape2D extends Shape
{
	private String name;
	
	public Shape2D(String name)
	{
		super();
		
		this.name = name;
	}

	@Override
	public String getName()
	{
		return this.name;
	}

}
