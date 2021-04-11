<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<f:setBundle basename="ma.ensa.resources.messages" var="format"/>
 
<title>Insert title here</title>
</head>
<body>
<h2><f:message key="welcome" bundle="${format}"/> </h2>
<a href='Inscription.jsp'><f:message key="Nouveau_client" bundle="${format}"/></a></br>
<a href='Identification.jsp'><f:message key="Ancien_client" bundle="${format}"/></a>
</body>
</html>