<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		this  is  data3.jsp <br/> ${name} , ${password}
		<br/><br/><br/>
		我是Form<br/>
		
		<form action="/SpringMvcPx/dataTrans/data3.htm"  method="POST">
			用户名：<input type="text" name="username">
			<br/>
			密码：<input type="text" name="password"  >
			
			<input type="submit" value="提交">
		</form>
		
	</body>
	
</html>



