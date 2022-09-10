<%@page import="com.godoro.user.UserManager"%>
<%@page import="com.godoro.user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    UserManager userManager=new UserManager();
    String username="",password="",message="";
    if(request.getParameter("login")!=null)
    {
    	username=(String)(request.getParameter("username"));
    	password=(String)(request.getParameter("password"));
    	try{
    	User user=userManager.findByUserName(username);
    	
    	if(username.equals(user.getUserName()) && password.equals(user.getPassword()))
    	{
    		response.sendRedirect("Home.jsp");
    		message="";
    		session.setAttribute("username", username);
    	}
    	}catch(Exception e){
    		e.getMessage();
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="" method="POST">
Username: <input type="text" name="username" value="<%=username %>"/><br><br>
Password: <input type="password" name="password" value="<%=password %>"/><br><br>
<input type="submit" value="Login" name="login"/><br>
Message:<input type="text" name="message" value="<%=message %>" />
</form>

</body>
</html>