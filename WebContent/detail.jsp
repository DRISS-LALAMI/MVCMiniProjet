<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ma.ensa.model.*" %>
    <%@ page import="java.util.List" %>
     <%@ page import="java.util.ArrayList" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<f:setBundle basename="ma.ensa.resources.messages" var="detail"/>
<f:setLocale value="<%=request.getLocale()%>" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Article A = (Article) request.getAttribute("arti");  %>
	<div>CodeArticle : <%=A.getCode() %> </div> 
		<div>Designation : <%=A.getDesignation() %> </div>
			<div><f:message key="prix" bundle="${detail}"/> : <f:formatNumber value="<%=A.getPrix() %>" type="currency"  /> </div> 
				<div>Stock : <%=A.getStock() %> </div> 
					<div>Categorie : <%=A.getCategorie() %> </div> 
					<img style="width:200px; height:200px;" src="<%=A.getPhoto() %>"> 
            		
</body>
</html>