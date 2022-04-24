package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dao.Userdao;
import com.example.demo.model.User;

@Controller
public class Usercontroller {
	
	@Autowired
	Userdao userdao;
@RequestMapping("index")
	public String user() 
{
	return "index.jsp";	
	}
@RequestMapping("adduser")
public String adduser(User user) 
{
	userdao.save(user);
return "index.jsp";	
}
@RequestMapping("getuser")
public ModelAndView getuser(@RequestParam int id) 
{
	ModelAndView mav = new ModelAndView("showuser.jsp");
	User user =userdao.findById(id).orElse(new User());
	mav.addObject(user);
			return mav;	
}
@RequestMapping("deleteuser")
public ModelAndView deleteuser(@RequestParam int id) 
{
	ModelAndView mav = new ModelAndView("deleteuser.jsp");
	User user =userdao.findById(id).orElse(new User());
	userdao.deleteById(id); 
	mav.addObject(user);
			return mav;	
}
@RequestMapping("updateuser")
public ModelAndView updateuser(User user) 
{
	ModelAndView mav = new ModelAndView("updateuser.jsp");
	 user =userdao.findById(user.getId()).orElse(new User());
	userdao.deleteById(user.getId()); 
	mav.addObject(user);
			return mav;	
}
}
