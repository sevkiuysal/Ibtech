<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    int sum=0;
    int left=0;
    int right=0;
    if(request.getParameter("add")!=null)
    {
    	left=Integer.parseInt(request.getParameter("left"));
    	right=Integer.parseInt(request.getParameter("right"));
    	sum=left+right;
    }
    %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Toplam : <%=sum %><br/>
<form action="" method="POST">
Sol: <input type="text" name="left" value="<%=left %>"/><br><br>
Sağ: <input type="text" name="right" value="<%=right %>"/><br><br>
<input type="submit" value="toplam" name="add">

</form>
</body>
</html>