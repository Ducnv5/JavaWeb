package entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Article {
	@NotNull(message = "Id may not be null")
	private String header;
	
	@NotNull(message = "Id may not be null")
	private String body;
	
	@NotNull(message = "Id may not be null")
	private String segment;
	
	@NotNull(message = "Id may not be null")
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
