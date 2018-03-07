package com.spring.mvc.cp2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MVCServlet")
public class MVCServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public MVCServlet() {
        super();
    }
    
    /**
     * 数据量小
     * 浏览器中显示出你请参数
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("name"));//获取参数
		
		System.out.println("doGet");
		response.getWriter().write("invode doGet method");
	}
	
	/**
	 * form表单提交
	 * 数据量大；
	 * 浏览器的地址栏中不会显示出来
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("password = " + request.getParameter("password"));//获取参数
		System.out.println("doPost");
		response.getWriter().write("invode doPost method");
	}

}


