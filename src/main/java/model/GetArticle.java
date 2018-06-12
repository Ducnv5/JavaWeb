package model;

import entity.*;
import java.util.ArrayList;

public class GetArticle {
	
	
	public ArrayList<Article> getArticle()
	{
		ArrayList<Article> articles = new ArrayList<Article>();
		
		Article a1 = new Article("football news", "this is the first news of football", "football","championleague",1);
		Article a2 = new Article("economics news", "this is the first news of economics", "economics","stocks",2);
		
		articles.add(a1);
		articles.add(a2);
		return articles;
	}
}
