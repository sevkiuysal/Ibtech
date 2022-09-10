<%@page import="com.godoro.user.UserManager"%>
<%@page import="com.godoro.user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    UserManager userManager=new UserManager();
    String username="",password="";
    int userid=10;
    if(request.getParameter("save")!=null)
    {
    	username=(String)(request.getParameter("username"));
    	password=(String)(request.getParameter("password"));
    	User user=new User(userid,username,password);
    	try{
    		userManager.create(user);	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	userid++;
    	response.sendRedirect("Home.jsp");
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
Password: <input type="text" name="password" value="<%=password %>"/><br><br>
<input type="submit" value="SAVE" name="save"/><br>

</form>

</body>
</html>