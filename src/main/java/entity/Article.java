package entity;

public class Article {
	private String header;
	private String body;
	private String segment;
	private String group;
	private int id;
	
	public Article(String header, String body, String group, String segment, int id)
	{
		this.id = id;
		this.header = header;
		this.body = body;
		this.segment = segment;
		this.group = group;
	}
	
	public String getHeader()
	{
		return header;
	}
	
	public String getBody()
	{
		return header;
	}
	
	public String getId()
	{
		return header;
	}
	
	public void setHeader(String header)
	{
		this.header = header;
	}
	
	public void setBody(String body)
	{
		this.body = body;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
}
