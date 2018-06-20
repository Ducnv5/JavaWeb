package controller;

import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Article;
import entity.HeaderItem;
import entity.User;
import entity.student;
import model.*;

@Controller
public class HomePage {
	

	@RequestMapping(value= {"/", "/homepage"}, method = RequestMethod.GET, produces="application/x-www-form-urlencoded;charset=UTF-8")
	public String HomePage(Model model, HttpServletRequest request, HttpServletResponse response ) throws UnsupportedEncodingException {
		StandardCharsets.UTF_8.name();
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("home page handler: ");
		
		ArrayList<HeaderItem> header = GetHeaderItems.GetHeaderItems();
		Article art = GetArticle.getSingleArticle();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(art.getInput_time());
		String str = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);
		
		model.addAttribute("headers", header);
		model.addAttribute("art", art);
		model.addAttribute("input_time", str);

		System.out.println("home page handler id: " + art.getId());
		
		return "HomePage/cafef";
	}

	@RequestMapping(value= "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String ArticleId(@PathVariable("id") String id, Model model) {
		Article art = GetArticle.getSingleArticle();
		model.addAttribute("art", art);

		System.out.println("detail request to id: " + id);

		//return "ArticleDetail/detail";
		return "HomePage/cafef";
	}
	
	@RequestMapping(value = "addarticle", method = RequestMethod.POST)
	public String addArticle(@ModelAttribute("user") @Validated User user, BindingResult result) {
		System.out.println("in addarticle ");
		if (result.hasErrors()) {
			for (ObjectError objectError: result.getAllErrors()) {
				System.out.println(objectError);
				System.out.println(objectError.getCode());
			}
			return "HomePage/login";
		}
		return "InputArticle/newArticle";
	}
	
	@RequestMapping(value = "savearticle", method = RequestMethod.POST)
	public String saveArticle(@ModelAttribute("article") @Validated Article article, BindingResult result) {
		System.out.println("in addarticle ");
		if (result.hasErrors()) {
			for (ObjectError objectError: result.getAllErrors()) {
				System.out.println(objectError);
				System.out.println(objectError.getCode());
			}
			return "InputArticle/newArticle";
		}
		return "HomePage/HomePage";
	}

}
