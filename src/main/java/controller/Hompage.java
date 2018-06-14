package controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.User;
import entity.student;
import imic.com.springmvchello.entities.*;
import model.*;

@Controller
public class Hompage {

	@RequestMapping(value= {"/", "/homepage"}, method = RequestMethod.GET)
	public String HomePage(Model model) {
		ArrayList<student> arr = new ArrayList<student>();
		student std1 = new student("nguyen van a", 1);
		student std2 = new student("nguyen van B", 167);
		student std3 = new student("Jon Janses Campous", 341);
		student std4 = new student("Igor Lazkozar", 12);
		arr.add(std4);arr.add(std3);arr.add(std2);arr.add(std1);
		model.addAttribute("students", arr);
		System.out.println("home page handler: ");

		return "HomePage/HomePage";
	}
	
	@RequestMapping(value= {"/", "/homepage"}, method = RequestMethod.POST)
	public String HomePagePost(Model model) {

		return "HomePage/HomePage";
	}

	@RequestMapping(value= "article/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String ArticleId(@PathVariable("id") int id, Model model) {
		student std = new student();
		std.setName("Nguyen Van A " + id);
		std.setId(id*25 + 10);
		model.addAttribute("art", std);
		System.out.println("request to id: " + id);

		return "HomePage/ArticleIndex";
	}
	
	@RequestMapping(value= "/headertop", method = RequestMethod.GET)
	public String HeaderTop(Model model) {

		return "HomePage/HeaderTop";
	}
	
	@RequestMapping(value= "/headertop2", method = RequestMethod.GET)
	public String HeaderTop2(Model model) {

		return "HomePage/HeaderTop2";
	}
	
	@RequestMapping(value= "/headerright", method = RequestMethod.GET)
	public String HeaderRight(Model model) {

		return "HomePage/HeaderRight";
	}
	
	@RequestMapping(value= "/headerinclude", method = RequestMethod.GET)
	public String HeaderInclude(Model model) {

		return "HomePage/HeadInclude";
	}
	
	@RequestMapping(value= "/dropdown", method = RequestMethod.GET)
	public String dropDown(Model model) {
		student std = new student();
		std.setId(12345);
		std.setName("name 9832r sdjhf");
		model.addAttribute("std", std);
		return "HomePage/dropDown";
	}
	
/*	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doLogin(Model model) {
		System.out.println("in /login ");
		if (!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return "login";
	}*/
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String doLogin2(Model model) {
		System.out.println("in login ");
		if (!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return "Homepage/login";
	}
	

}
