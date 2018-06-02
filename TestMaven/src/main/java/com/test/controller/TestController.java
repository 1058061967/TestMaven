package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {
	@RequestMapping("/Login")
	public ModelAndView login(
			@RequestParam(value="name",required=false) String name,
			@RequestParam("password") String password){
		ModelAndView mv = new ModelAndView("menu");
		mv.addObject("name",name);
		return mv;
	}
}
