package com.spring.mvc.cp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 *  MVC设计模式：
 *  Controller 就是 C
 * 	 ModelAndView：包括了 Model 和 View
 */
@Controller 
@RequestMapping("mvc")
public class MVCDemoController {
	
	//JavaBean就是类
	@RequestMapping("mvcView")
	public ModelAndView mvcView(Person person){
		ModelAndView mv = new ModelAndView("mvcView");//mvcView 就是View层
		
		if(null != person){
			System.out.println("person.username = " + person.getUsername());
			System.out.println("person.age = " + person.getAge());
			System.out.println("person.weight = " + person.getWeight());
		}
		
		Person p = new Person();
		p.setAddress("北京");
		p.setAge(19);
		p.setPassword("1233456");
		p.setUsername("jack");
		p.setWeight(60);
		mv.addObject("p", p);
		
		mv.addObject("username", "jack");//Mode中的数据
		return mv;
	}

}
