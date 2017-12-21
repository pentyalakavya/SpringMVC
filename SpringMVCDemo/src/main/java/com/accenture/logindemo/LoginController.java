package com.accenture.logindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	private LoginBean lb;
	
	public LoginBean getLb() {
		return lb;
	}

	public void setLb(LoginBean lb) {
		this.lb = lb;
	}

	@RequestMapping("/loginUrl")
	public ModelAndView loginUser(@RequestParam("uname") String userName,@RequestParam("pwd") String password)
	{
	ModelAndView mv=new ModelAndView();
	boolean result=lb.isAuthentic(userName, password);
	if(result)
	{
	 mv.addObject("message", "Hello"+userName);
	 mv.setViewName("Success");
	}
	else
	{
		mv.addObject("message","Login Failed!!");
		mv.setViewName("Failure");
	}
	return mv;
	}
	
}
