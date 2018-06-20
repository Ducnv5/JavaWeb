package entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Article {
	@NotNull(message = "Id may not be null")
	private String header;
	
	@NotNull(message = "body may not be null")
	private String body;
	
	@NotNull(message = "preview may not be null")
	private String preview;
	
	@NotNull(message = "segment may not be null")
	private String segment;
	
	@NotNull(message = "group may not be null")
	private String group;
	
	@NotNull(message = "link may not be null")
	private String href_1;
	
	@NotNull(message = "link may not be null")
	private String href_2;
	
	@NotNull(message = "group may not be null")
	private Date input_time;
	
	private String id;
	
	public Article()
	{
		
	}
	
	public String getHeader()
	{
		return header;
	}
	
	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getHref_1() {
		return href_1;
	}

	public void setHref_1(String href_1) {
		this.href_1 = href_1;
	}

	public String getHref_2() {
		return href_2;
	}

	public void setHref_2(String href_2) {
		this.href_2 = href_2;
	}

	public Date getInput_time() {
		return input_time;
	}

	public void setInput_time(Date input_time) {
		this.input_time = input_time;
	}

	public String getBody()
	{
		return header;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setHeader(String header)
	{
		this.header = header;
	}
	
	public void setBody(String body)
	{
		this.body = body;
	}
	
	public void setId(String string)
	{
		this.id = string;
	}
}
