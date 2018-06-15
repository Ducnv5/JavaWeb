package entity;

public class HeaderItem {
	private String id;
	private String class_;
	private String class_1;
	private String href_;
	private String title_;
	private String text_;
	
	public HeaderItem(String id, String class_, String href_, String title_, String text_, String class_1)
	{
		this.id = id;
		this.class_ = class_;
		this.href_ = href_;
		this.text_ = text_;
		this.title_ = title_;
		this.class_1 = class_1;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getClass_1() {
		return class_1;
	}
	public void setClass_1(String class_1) {
		this.class_1 = class_1;
	}
	public String getHref_() {
		return href_;
	}
	public void setHref_(String href_) {
		this.href_ = href_;
	}
	public String getTitle_() {
		return title_;
	}
	public void setTitle_(String title_) {
		this.title_ = title_;
	}
	public String getText_() {
		return text_;
	}
	public void setText_(String text_) {
		this.text_ = text_;
	}
	
}
