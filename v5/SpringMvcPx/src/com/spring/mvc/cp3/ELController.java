package com.spring.mvc.cp3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * EL表达式
 */

@Controller
@RequestMapping("el")
public class ELController {

	@RequestMapping("elIndex")
	public ModelAndView elIndex(){
		ModelAndView mv = new ModelAndView("cp3/elIndex");
		
		mv.addObject("username", "张三");
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("nodejs");
		mv.addObject("list", list);
		
		return mv;
	}
	
}
