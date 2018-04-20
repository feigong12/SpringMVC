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
     * ������С
     * ���������ʾ���������
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("name"));//��ȡ����
		
		System.out.println("doGet");
		response.getWriter().write("invode doGet method");
	}
	
	/**
	 * form���ύ
	 * ��������
	 * ������ĵ�ַ���в�����ʾ����
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("password = " + request.getParameter("password"));//��ȡ����
		System.out.println("doPost");
		response.getWriter().write("invode doPost method");
	}

}


