<%@page import="com.godoro.rectangle.Rectangle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    int result=0;
    Rectangle rectangle=new Rectangle();
    
    
    if(request.getParameter("area")!=null)
    {
    	rectangle.setWidht(Integer.parseInt(request.getParameter("width")));
    	rectangle.setHeight(Integer.parseInt(request.getParameter("height")));
    	result=rectangle.getArea();
    }
    else  if(request.getParameter("perimeter")!=null)
    {
    	rectangle.setWidht(Integer.parseInt(request.getParameter("width")));
    	rectangle.setHeight(Integer.parseInt(request.getParameter("height")));
    	result=rectangle.getPerimeter();
    }
	
	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rectangle with Object</title>
</head>
<body>
Result : <%=result %><br/>
<form action="" method="POST">
Width: <input type="text" name="width" value="<%=rectangle.getWidht() %>"/><br><br>
Height: <input type="text" name="height" value="<%=rectangle.getHeight() %>"/><br><br>
<input type="submit" value="Alan" name="area">
<input type="submit" value="Çevre" name="perimeter">

</form>
</body>
</html>