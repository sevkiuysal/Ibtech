<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    int width=0;
    int height=0;
    int result=0;
    
    if(request.getParameter("area")!=null)
    {
    	width=Integer.parseInt(request.getParameter("width"));
    	height=Integer.parseInt(request.getParameter("height"));
    	result=width*height;
    }
    else  if(request.getParameter("perimeter")!=null)
    {
    	width=Integer.parseInt(request.getParameter("width"));
    	height=Integer.parseInt(request.getParameter("height"));
    	result=2*(width+height);
    }
	
	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rectangle</title>
</head>
<body>
Result : <%=result %><br/>
<form action="" method="POST">
Width: <input type="text" name="width" value="<%=width %>"/><br><br>
Height: <input type="text" name="height" value="<%=height %>"/><br><br>
<input type="submit" value="Alan" name="area">
<input type="submit" value="Çevre" name="perimeter">

</form>
</body>
</html>