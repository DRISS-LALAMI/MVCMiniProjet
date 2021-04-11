<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<f:setBundle basename="ma.ensa.resources.messages" var="form"/>
<title>Insert title here</title>
</head>
<body>
 
<a href="CatalogueControler"><f:message key="catalogue" bundle="${form}"/></a>
<a href="Commande"><f:message key="commande" bundle="${form}"/></a>
<a href="Panier"><f:message key="panier" bundle="${form}"/></a>
</body>
</html>