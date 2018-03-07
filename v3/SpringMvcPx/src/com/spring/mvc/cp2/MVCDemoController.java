package com.spring.mvc.cp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/** 
 *  MVC���ģʽ��
 *  Controller ���� C
 * 	 ModelAndView�������� Model �� View
 */
@Controller 
@RequestMapping("mvc")
public class MVCDemoController {
	
	//JavaBean������
	@RequestMapping("mvcView")
	public ModelAndView mvcView(Person person){
		ModelAndView mv = new ModelAndView("mvcView");//mvcView ����View��
		
		if(null != person){
			System.out.println("person.username = " + person.getUsername());
			System.out.println("person.age = " + person.getAge());
			System.out.println("person.weight = " + person.getWeight());
		}
		
		Person p = new Person();
		p.setAddress("����");
		p.setAge(19);
		p.setPassword("1233456");
		p.setUsername("jack");
		p.setWeight(60);
		mv.addObject("p", p);
		
		mv.addObject("username", "jack");//Mode�е�����
		return mv;
	}

}
