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
<meta charset="ISO-8859-1">
<f:setBundle basename="ma.ensa.resources.messages" var="cata"/>
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="5">
<tr>
<td>CodeArticle</td>
<td>Designation</td>
<td><f:message key="prix" bundle="${cata}"/></td>
<td>Stock</td>
<td>Categorie</td>
<td><f:message key="pho" bundle="${cata}"/></td>
<td></td>
</tr>
<% 
List <Article> lista = (ArrayList<Article>) request.getAttribute("arti");
for (Article ar: lista){	

%>
<tr>
<td><a href="Details?id=<%=ar.getCode() %>"><%=ar.getCode() %></a> </td>
<td><%=ar.getDesignation() %></td>
<td><%=ar.getPrix()%></td>
<td><%= ar.getStock()%></td>
<td><%=ar.getCategorie()%></td>
<td><img style="width:120px; height:120px; " src="<%= ar.getPhoto()%>"></td>
<td><a href="Details?num=<%=ar.getCode() %>"> Ajouter au panier </a></td>
</tr>
<% }%>
</table>
</body>
</html>