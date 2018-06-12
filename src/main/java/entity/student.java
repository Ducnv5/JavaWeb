package entity;

public class student {
	private int id;
	private String name;
	
	public student(String name, int id)
	{
		this.id = id;
		this.name = name;
	}
	public student()
	{
		
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
