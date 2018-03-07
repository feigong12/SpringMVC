package com.spring.mvc.cp2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ���ݴ���Controller
 */
@Controller
@RequestMapping("dataTrans")
public class DataTransController {
	
	//������������ַ�� /SpringMvcPx/dataTrans/data1.htm
	@RequestMapping("data1")
	public ModelAndView toData1(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView mv = new ModelAndView("data1");
		System.out.println("DataTransController#toData1");
		String s = req.getParameter("username");
		System.out.println("username = " + s);
		return mv;
	}
	
	//�ڶ���ȡֵ��ʽ�������ں����Ĳ�������������������
	@RequestMapping("data2")
	public ModelAndView toData2(String username){
		ModelAndView mv = new ModelAndView("data2");
		System.out.println("username = " + username);
		return mv;
	}
	
	//����̨��ֵ����ҳ�����չʾ
	@RequestMapping("data3")
	public ModelAndView data3(String username, String password){
		ModelAndView mv = new ModelAndView("data3");
		mv.addObject("name", "��������");
		mv.addObject("password", password);
		System.out.println("username = " + username + ", password = " + password);
		return mv;
	}
	
}
