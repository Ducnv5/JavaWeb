package entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class User {
	@NotNull(message = "Id may not be null")
	private String userName;
	
	@NotNull(message = "Id may not be null")
	@Length(min = 6, max = 15)
	private String password;
	
	public void setUserName(String username)
	{
		this.userName = username;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
		
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public String getPassword()
	{
		return this.password;
	}
}
