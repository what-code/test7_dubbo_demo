package com.test.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class IndexController{
	
	/**
	 * 首页
	 * 
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String indexPost(HttpServletRequest request,HttpServletResponse response) {
		@SuppressWarnings("unused")
		String temp = "str";
		return "/index";
	}
}
