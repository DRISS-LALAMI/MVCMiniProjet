<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	int nombre =  (int) request.getAttribute("nombre");
for (int i = 1; i <= nombre; i++) {
						String article = (String) session.getAttribute("article" + i);
	%>
				<div><%=article%> </div>
<%}%>					
</body>
</html>