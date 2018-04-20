package com.spring.mvc.cp2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//spring的注解；@Controller就表示这是一个Servlet
@Controller
public class IndexController {
	
	@RequestMapping("toIndex")
	public void toIndex(HttpServletRequest request, HttpServletResponse response){
		try {
			response.getWriter().write("toIndex=============");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("toIndex1")
	public ModelAndView toIndex1(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView("toIndex1");//页面：跳转到这个页面
		return mv;
	}
	
}
