package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Indexcontroller {
	@RequestMapping("index")
	
	public ModelAndView index(Userdetails ud) {
	/*	HttpSession session = request.getSession();
		String s = request.getParameter("name");*/
		ModelAndView mav = new ModelAndView()	;
		mav.addObject("details",ud);
		mav.setViewName("index");
		//session.setAttribute("username", login);
		return mav;
	}

}
