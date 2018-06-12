package imic.com.springmvchello.entities;

public class Info {
	private String author;
	private String license;
	private int number;
	
	public Info()
	{
		author = "author 1";
		license = "NO 234324";
		number = 123;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
