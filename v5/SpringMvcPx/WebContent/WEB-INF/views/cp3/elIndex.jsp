<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		this  is elIndex.jsp <br/>
		
		EL表达式： <br/>
		
		username = ${username} <br/>
		list = ${list} 
		
		<br/>
		一行展示一个编程语言：(JSTL协助解决)<br/>
		
		<c:forEach items="${list}"  var="item" >
				${item } <br/>
		</c:forEach>
		
	</body>
	
</html>
