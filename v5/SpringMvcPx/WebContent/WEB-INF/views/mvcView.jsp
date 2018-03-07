<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		this  is  mvcView.jsp <br/> ${username}
		 <br/><br/>
		 用户名 ${p.username }
		 <br/>
		 密码 ${p.password }
		 <br/>
		 年龄 ${p.age }
		 <br/>
		 体重 ${p.weight }
		 
		  <br/> <br/>
		 <form action="/SpringMvcPx/mvc/mvcView.htm"  method="POST">
			用户名：<input type="text" name="username">
			<br/>
			密码：<input type="text" name="password"  >
			<br/>
			年龄：<input type="text" name="age"  >
			<br/>
			体重：<input type="text" name="weight"  >
			
			<input type="submit" value="提交">
		</form>
					
	</body>
	
</html>



